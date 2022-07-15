<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="hotel.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<style>
	body{background-color:greenyellow;}
</style>
<body>
<table style="width: 1200px;height: 700px;" class="border border-dark border border-5 bg-dark bg-gradient">
    <tr id="Menu" style="border: none;">
        <td>
            <a class="selected">&nbsp;&nbsp;예약관리&nbsp;&nbsp;</a>
            <a href="hotelManagement2.jsp" class="nonsel">&nbsp;&nbsp;객실관리&nbsp;&nbsp;
            </a>
        </td>
    </tr>
    <tr>
        <td>
            <table class="border border-warning">
                <tr>
                    <td class="right">숙박기간&nbsp;&nbsp;</td>
                    <td><input type="date" id="checkin" style="width: 90px;font-size:small;">~<input type="date" id="checkout" style="font-size:small;width: 90px;"></td>
                </tr>
                <tr>
                    <td class="right">숙박인원&nbsp;&nbsp;</td>
                    <td><input id="r_people" type="text">명</td>
                </tr>
                <tr>
                    <td class="right" >객실종류&nbsp;&nbsp;</td>
                    <td><select id="type" class="sel1" style="width: 200px;">
                    </select></td>
                </tr>
                <tr>
                    <td id="btn_srch" colspan="2" style="text-align: center">
                        <input type="button" id="btnSearch" class="btn btn-secondary" value="  찾기  ">
                    </td>
               </tr>
                <tr>
                    <td colspan="2" class="subMenu">
                        &nbsp;&nbsp;&nbsp;&nbsp;예약가능객실
                    </td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center;height: 450px;vertical-align: top;">
                        <select size="16" class="sel_wid1" id="can" style="font-size: larger;">
                        </select>
                    </td>
                </tr>
            </table>    
        </td>
        <td>
            <table id="tbl2" class="border border-warning">
               <tr>
                <td class="right">예약번호&nbsp;&nbsp;</td>
                <td><input id="reservCode" type="text" readonly></td>
            </tr>
            <tr>
                <td class="right">객실명&nbsp;&nbsp;</td>
                <td><input type="text" id="r_name" readonly></td>
            </tr>
            <tr>
                <td class="right">객실종류&nbsp;&nbsp;</td>
                <td><input type="text" id="typename" readonly></td>
            </tr>
            <tr>
               <td class="right">숙박예정인원&nbsp;&nbsp;</td>
               <td><input type="text" id="people">명</td>
            </tr>
            <tr>
                <td class="right">숙박기간&nbsp;&nbsp;</td>
                <td><input type="date" id="checkin2" style="width: 90px;font-size:small;" readonly>~<input type="date" id="checkout2" style="width: 90px;font-size:small;" readonly></td>
            </tr>
            <tr>
                <td class="right">예약자&nbsp;&nbsp;</td>
                <td><input type="text" id="name"></td>
            </tr>
            <tr>
                <td class="right">모바일&nbsp;&nbsp;</td>
                <td><input type="text" id="mobile"></td>
            </tr>
            <tr>
                <td class="right">숙박총액&nbsp;&nbsp;</td>
                <td><input type="text" id="price" readonly>원</td>
            </tr> 
            <tr>
                <td id="btn_rsv" colspan="2" style="text-align: center;">
                    <input type="button" class="btn btn-secondary" id="confirm" value="예약등록">
                    <input type="button" class="btn btn-secondary" id="cancel" value="예약취소">
                    <input type="button" class="btn btn-secondary" id="clr" value=" 비우기 ">
                </td>
            </tr>
            <tr>
                <td style="height: 300px;" colspan="2"><input type='hidden' id='hid'><input type='hidden' id='hid2'></td>
            </tr>
            </table>
        </td>
        <td>
            <table class="border border-warning">
                <tr>
                    <td class="subMenu">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;예약내역</td>
                </tr>
                <tr>
                    <td style="text-align:center; vertical-align: top;">
                        <select size="35" id="reservList" class="sel_wid1" style="font-size: smaller;">
                        </select>
                    </td>
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
	selType();
})
.on('click','#btnSearch',function(){
	if($('#checkin').val()==null||$('#checkout').val()==null||$('#r_people').val()==null||$('#type').val()==""||$('#checkin').val()==""||$('#checkout').val()==""||$('#r_people').val()==""||$('#type').val()==""){
		alert('숙박기간과 숙박인원, 객실종류를 모두 입력해 주세요');
		return;
	}else{
		$.ajax({
			type:'get',dataType:'text',
			url:'reservSearch',
			data:'checkin='+$('#checkin').val()+'&checkout='+$('#checkout').val()
				+'&people='+$('#r_people').val()+'&type='+$('#type').val(),
			
			success:function(data){
				$('#can').empty().append(data);
				selReserv();
				$('#clr').trigger('click');
			}
		})
	}
	
})
.on('click','#cancel',function(){
	if($('#reservList option:selected').prop('selected')==true){
		$.ajax({
			type:'get',dataType:'text',
			url:'reservCancel',
			data:'reservNum='+$('#reservList option:selected').val(),
			success:function(){
				selReserv();
				$('#btnSearch').trigger('click');
			}
		})
	}else{
		alert('예약된 내역을 선택해 주세요');
		return;
	}
	
})
.on('click','#confirm',function(){
	if($('#can option:selected').prop('selected')==true||$('#reservList option:selected').prop('selected')==true){
		if($('#can option:selected').prop('selected')==true){
			let str = $('#can option:selected').text().split(' ');
			str[2]=$.trim(str[2].replace('명',''));
				if($('#people').val()==null||$('#people').val()==""||$('#mobile').val()==null||$('#mobile').val()==""){
					alert('예약자와 전화번호를 입력해주세요.');
					return;
				}else{
					if($('#people').val()>str[2]){
						alert('예약가능인원을 초과했습니다.');
						return;
					}
					else{
						$.ajax({
							type:'get',dataType:'text',
							url:'reservAdd',
							data:'checkin='+$('#checkin2').val()+'&checkout='+$('#checkout2').val()
								+'&people='+$('#people').val()+'&name='+$('#name').val()
								+'&mobile='+$('#mobile').val()+'&price='+$('#price').val()
								+'&r_num='+$('#can option:selected').attr('name'),
							
							success:function(){
								selReserv();
								$('#btnSearch').trigger('click');
							}
						})
					}				
				}
		}
		else if($('#reservList option:selected').prop('selected')==true){
			if($('#people').val()==null||$('#people').val()==""||$('#mobile').val()==null||$('#mobile').val()==""){
				alert('예약자와 전화번호를 입력해주세요.');
				return;
			}else{
				if(parseInt($('#people').val())>parseInt($('#hid2').val())){
					alert('예약가능인원을 초과했습니다.');
					return;
				}
				else{
					$.ajax({
						type:'get',dataType:'text',
						url:'reservUpdate',
						data:'reservNum='+$('#reservList option:selected').val()+'&name='+$('#name').val()
							+'&mobile='+$('#mobile').val()+'&people='+$('#people').val(),
						success:function(){
							selReserv();
							$('#btnSearch').trigger('click');
						}
					})
				}				
			}
		}
	}else{
		alert('이용가능한 객실 또는 예약내역을 선택해 주세요');
		return;
	}
	
})
.on('click','#can option',function(){
	$('#tbl2 input[type="text"],#tbl2 input[type="date"]').val('');
	$('#reservList option:selected').prop('selected',false);
	let str = $('#can option:selected').text().split(' ');
	$('#r_name').val(str[0]);
	$('#typename').val(str[1]);
	$('#people').val($('#r_people').val());
	$('#checkin2').val($('#checkin').val());
	$('#checkout2').val($('#checkout').val());
	var date = new Date($('#checkin').val());
	var date2 = new Date($('#checkout').val())
	$('#price').val((((((date2.getTime()-date.getTime())/1000)/60)/60)/24)*$('#can option:selected').val())
})
.on('click','#reservList option',function(){
	$('#can option:selected').prop('selected',false);
	$.ajax({
		type:'get',
		data:'reservNum='+$('#reservList option:selected').val(),
		dataType:'text',
		url:'searchReserv',
		success:function(data){
			$('#hid').val(data);
			let str2 = $('#reservList option:selected').text().split(' ');
			let day = str2[1].split('~');
			$('#reservCode').val($('#reservList option:selected').val());
			$('#r_name').val(str2[0]);
			$('#checkin2').val(day[0]);
			$('#checkout2').val(day[1]);
			let Data = $('#hid').val().split(' ');
			$('#name').val(Data[0]);
			$('#mobile').val(Data[1]);
			$('#people').val(Data[2]);
			$('#typename').val(Data[3]);
			$('#price').val(Data[4]);
			$('#hid2').val(Data[5]);
			console.log($('#hid2').val());
		}
	})
	
	
})
.on('click','#clr',function(){
	$('#tbl2 input[type="text"],#tbl2 input[type="date"]').val('');
	//$('#type').val(0).prop('selected',true);
	$('#reservList option:selected, #can option:selected').prop('selected',false);
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
function selReserv(){
	$.ajax({
		type:'get',dataType:'text',
		url:'reservList',
		data:'checkin='+$('#checkin').val()+'&checkout='+$('#checkout').val()
			+'&people='+$('#r_people').val()+'&type='+$('#type').val(),
		
		success:function(data){
			$('#reservList').empty().append(data);
		}
	})
}
</script>
</html>