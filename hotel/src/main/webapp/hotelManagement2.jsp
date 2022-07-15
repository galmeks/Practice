<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="hotel.css">
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <table style="width: 600px;height: 700px;" class="border border-dark bg-dark bg-gradient border border-5">
        <tr style="border: none;">
            <td id="Menu">
                <a href="hotelManagement.jsp" class="nonsel">&nbsp;&nbsp;예약관리&nbsp;&nbsp;</a>
                <a class="selected">&nbsp;&nbsp;객실관리&nbsp;&nbsp;</a>
            </td>
        </tr>
        <tr>
            <td>
                <table class="border border-warning">
                    <tr>
                        <td class="subMenu">
                            &nbsp;&nbsp;&nbsp;객실목록
                        </td>
                    </tr>
                    <tr>
                        <td style="text-align: center;vertical-align: middle;">
                            <select size="24" id="RoomList" class="sel2">
                            </select>
                        </td>
                    </tr>
                </table>
            </td>
            <td>
                <table class="border border-warning">
                    <tr>
                        <td style="height: 50px;"></td>
                    </tr>
                    <tr>
                        <td class="right">객실명&nbsp;&nbsp;</td>
                        <td><input type="text" id="name"></td>
                    </tr>
                    <tr>
                        <td class="right">객실종류&nbsp;&nbsp;</td>
                        <td><select class="sel1" id="type" style="width: 180px;">
                        </select></td>
                    </tr>
                    <tr>
                        <td class="right">숙박가능인원&nbsp;&nbsp;</td>
                        <td><input type="text" id="people">명</td>
                    </tr>
                    <tr>
                        <td class="right">1박 요금&nbsp;&nbsp;</td>
                        <td><input type="text" id="price">원</td>
                    </tr>
                    <tr>
                        <td id="btn_edit" colspan="2" style="text-align: center;">
                            <input type="button" id="insert" class="btn btn-secondary" value="등록">&nbsp;&nbsp;
                            <input type="button" id="remove" class="btn btn-secondary" value="삭제">&nbsp;&nbsp;
                            <input type="button" id="clr" class="btn btn-secondary" value="비우기">
                        </td>
                    </tr>
                    <tr>
                        <td style="height: 300px;"></td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</body>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.5/dist/umd/popper.min.js" integrity="sha384-Xe+8cL9oJa6tN/veChSP7q+mnSPaj5Bcu9mPX5F5xIGE0DVittaqT5lorf0EI7Vk" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.min.js" integrity="sha384-kjU+l4N0Yf4ZOJErLsIcvOU2qSb74wXpOhqTvwVx3OElZRweTnQ6d31fXEoRD1Jy" crossorigin="anonymous"></script>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.ready(function(){
	selList();
	selType();
})
.on('click','#insert',function(){
	if($('#name').val()==""||$('#name').val()==null||$('#people').val()==""||$('#people').val()==null||$('#price').val()==""||$('#price').val()==null||$('#type option:selected').val()==0){
		alert('값을 모두 입력해 주세요.');
		return;
	}
	else{
		if($('#RoomList option:selected').prop('selected')){
			$.ajax({
				type:'get',
				dataType:'text',
				url:'updateRoom',
				data:'seq='+$('#RoomList option:selected').val()+'&name='+$('#name').val()+
					 '&type='+$('#type option:selected').val()+
					 '&people='+$('#people').val()+'&price='+$('#price').val(),
				success:function(){
					selList();
					$('#clr').trigger('click')
				}
			})
		}
		else{
			$.ajax({
				type:'get',
				dataType:'text',
				url:'addRoom',
				data:'name='+$('#name').val()+'&type='+$('#type option:selected').val()+
					 '&people='+$('#people').val()+'&price='+$('#price').val(),
				success:function(){
					selList();
					$('#clr').trigger('click')
				}
			})
		}
	}
	
})
.on('click','#remove',function(){
	if($('#RoomList option:selected').prop('selected')==true){
		$.ajax({
			type:'get',
			dataType:'text',
			url:'removeRoom',
			data:'seq='+$('#RoomList option:selected').val(),
			success:function(){
				selList();
				$('#clr').trigger('click')
			}
		})
	}
	else{
		alert('삭제할 방을 선택해 주세요.');
		return;
	}

})
.on('click','#clr',function(){
	$('#name, #people, #price').val('');
	$('#type').val(0).prop('selected',true);
	$('#RoomList option:selected').prop('selected',false);
})
.on('click','#RoomList option',function(){
	let str = $('#RoomList option:selected').text().split(' ');
	str[2]=$.trim(str[2].replace('명',''))
	$('#name').val(str[0]);
	for(i=0;i<$('#type option').length;i++){
		if(str[1]==$('#type option:eq('+i+')').text()){
			$('#type option:eq('+i+')').prop('selected',true);
		}
	}
	
	$('#people').val(str[2]);
	$('#price').val(str[3]);
})
function selType(){
	$.ajax({
		type:'get',
		dataType:'text',
		url:'listType',
		success:function(data){
			$('#type').empty().append(data);
		}
	
	
	})
}
function selList(){
	$.ajax({
		type:'get',
		dataType:'text',
		url:'listRoom',
		success:function(data){
			$('#RoomList').empty().append(data);
		}
	
	
	})
}
</script>
</html>