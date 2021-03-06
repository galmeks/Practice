<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="Cafe.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="stylesheet" href="https://code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Hi+Melody&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Hi+Melody&family=Jua&display=swap" rel="stylesheet">
    <title>카페주문관리</title>
</head>
<!-- <style>
    td table{
        border-collapse: collapse;
        border: solid rgb(129, 108, 12);
        background-color: rgb(209, 172, 80);
        width: 400px;height: 880px; text-align: center;
    }
    /* td{
        border:solid green;
    } */
    button{
        width: 100px;height: 40px;font-size: large;
    }
    select{
        width: 360px;
        height: 600px;
        text-align-last: justify;
        border: yellow;
        background-color:palegoldenrod;
    }
    option{
        font-family: 'Hi Melody', cursive;
        font-size: xx-large;
    }
    #Result option{
        font-family: 'Hi Melody', cursive;
        font-size: x-large;
    }
    .index{
        font-family: 'Jua', sans-serif;
        font-size: xx-large;
    }
    label{
        vertical-align:bottom; font-size: x-large;
    }
    .Gl{
        font-size: large;
    }
    ._btn{
        width: 80px;height: 35px;
    }
    #M_list option{
        font-family: 'Hi Melody', cursive;
        font-size: x-large;
    }
</style> -->
<body>
    <table>
        <tr>
            <td>
                <table>
                    <tr>
                        <td style="height: 50px;"><label class="index">메뉴목록</label></td>
                    </tr>
                    <tr>
                        <td style="height: 620px;">
                            <select id="menu" size="20" style=" width: 360px; height: 600px;">
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td class="Gl" style="text-align: center;">
                            메뉴&nbsp;&nbsp;<input type="text" class="Gl" id="m_txt" style="width: 270px;" readonly>
                        </td>
                    </tr>
                    <tr>
                        <td class="Gl" style="text-align: center;">
                            수량&nbsp;&nbsp;<input type="number" class="Gl" id="m_cnt" min="1" max="999" style="width: 270px; text-align: right;" required>
                        </td>
                    </tr>
                    <tr>
                        <td class="Gl" style="text-align: center;">
                            가격&nbsp;&nbsp;<input type="number" class="Gl" id="m_val" style="width: 270px; text-align: right;" readonly>
                        </td>
                    </tr>
                    <tr>
                        <td style="height: 60;">
                            <button id="m_add">추가</button>&nbsp;&nbsp;&nbsp;<button id="m_cancel">취소</button>
                        </td>
                    </tr>
                </table>
            </td>
            <td>
                <table>
                    <tr>
                       <td style="height: 50px;"><label class="index">주문목록</label></td> 
                    </tr>
                    <tr>
                        <td style="height: 620px;">
                            <select size="20" id="order" >

                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td class="Gl">
                            모바일번호&nbsp;&nbsp;&nbsp;<input type="text" class="Gl" id="mobile" style="width:180px; text-align: right;" required>
                        </td>
                    </tr>
                    <tr>
                        <td class="Gl">
                            총액&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="number" class="Gl" id="o_val"  style="text-align: right; width:160px;" readonly>원
                        </td>
                    </tr>
                    <tr>
                        <td style="height: 60;">
                            <button id="o_confirm">주문완료</button>&nbsp;&nbsp;&nbsp;<button id="o_cancel">취소</button>
                        </td>
                    </tr>
                </table>
            </td>
            <td>
                <table>
                    <tr>
                       <td style="height: 50px;"><label class="index">매출</label></td> 
                    </tr>
                    <tr>
                        <td style="height: 620px;">
                            <select id="Result" size="20">

                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td rowspan="3" style="text-align-last: justify; vertical-align: middle; font-size: x-large;">
                            &nbsp;매출합계 &nbsp;&nbsp;&nbsp;<label id="sum"></label>원&nbsp;&nbsp;
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table><br>
    <a id="btnMenu" href="#">메뉴관리</a>
    <div id="dvMenu" style="display: none; width: 500;">
        <table style="vertical-align: top;">
            <tr>
                <td>
                    <select id="M_list" size="20" style="width: 200px;height: 400px;">
                    </select>
                </td>
                <td>
                    <table style="width: 200px; height: 400px;">
                        <tr><td><input type="hidden" id="optype"><br>메뉴명&nbsp;<input type="text" id="_name" style="width: 100px;"></td></tr>
                        <tr><td>가격&nbsp;&nbsp;<input type="number" id="_price" style="text-align: right; width: 80px;">원</td></tr>
                        <tr><td>&nbsp;</td></tr>
                        <tr><td><button id="_add" class="_btn">등록</button>&nbsp;&nbsp;<button id="_del" class="_btn">삭제</button><br><br>
                            <button id="_clr" class="_btn">비우기</button>&nbsp;&nbsp;<button id="_exit" class="_btn">종료</button></td></tr>
                        <!-- <tr><td><button id="_clr" class="_btn">비우기</button><button id="_exit" class="_btn">종료</button></td></tr> -->
                        <tr><td><br><br><br><br><br></td></tr>
                    </table>
                </td>
            </tr>
        </table>
    </div>
</body>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
<script>
    $('#o_val').val(0);
    $('#sum').text(0);
$(document)
 .ready(function(){
	 loadData();
     selData();
})
.on('click','#menu',function(){
    m_name=[];
    m_name=$('#menu option:selected').text().split(' ');
    $('#m_cnt').val(1);
    $('#m_txt').val(m_name[0]);
    prs=$('#menu option:selected').text().split(" ");
    $('#m_val').val($('#m_cnt').val()*parseInt(prs[1]))

})
.on('click','#m_cnt',function(){
    $('#m_val').val($('#m_cnt').val()*parseInt(prs[1]))
})
.on('click','#m_add',function(){
    if($('#m_txt').val()==''||$('#m_cnt').val()==''||$('#m_val').val()==''){
        alert('값이 주어지지 않았습니다.')
        return false;
    }
    else{
        $('#order').append('<option value='+$('#menu option:selected').val()+'>'+$('#m_txt').val()+' x'+$('#m_cnt').val()+' '+$('#m_val').val()+'</option>')
        $('#o_val').val(parseInt($('#o_val').val())+parseInt($('#m_val').val()));
        $('#m_cancel').trigger('click');
    }
    
})
.on('click','#m_cancel',function(){
    $('#m_txt').val('');$('#m_val').val('');$('#m_cnt').val('');
})
.on('click','#o_confirm',function(){
    if($('#o_val').val()==0){
        alert('값이 주어지지 않았습니다.')
        return false;
    }
    time=new Date();
    timestr='';
    time_m=time.getMonth()<9?'0'+(time.getMonth()+1):(time.getMonth()+1)
    time_d=time.getDate()<10?'0'+(time.getDate()):(time.getDate())
    time_h=time.getHours()<10?'0'+(time.getHours()):(time.getHours())
    time_mn=time.getMinutes()<10?'0'+(time.getMinutes()):(time.getMinutes())
    // if(time.getMonth()+1 <10){
    //     time_m = '0'+(time.getMonth()+1)
    // }
    // else{
    //     time_m =(time.getMonth()+1)
    // }
    // if(time.getDate()<10){
    //     time_d = '0'+time.getDate()
    // }
    // else{
    //     time_d =time.getDate()
    // }
    timestr=time.getFullYear()+'-'+time_m+'-'+time_d+' '+time_h+':'+time_mn
    for(i=0;i<$('#order option').length;i++){
    	o_props=$('#order option:eq('+i+')').text().split(" ");
    	o_props[1]=$.trim(o_props[1].replace('x',''));
    	$.ajax({
    	type:'get',
    	dataType:'text',
    	url:'inserttbl',
    	data:'mobile='+$('#mobile').val()+'&name='+o_props[0]+'&qty='+o_props[1]
    		+'&price='+o_props[2]+'&date='+timestr+'&seqno='+$('#order option:eq('+i+')').val(),
    	success:function(){
    	    selData();
    	},error:function(){
    		
    	},complete:function(){
    		$('#o_cancel').trigger('click');
    	}
    })
    }
    
/*    $('#Result').append('<option>'+timestr+' '+$('#mobile').val()+' '+$('#o_val').val()+'원</option>')
    $('#sum').text(parseInt($('#sum').text())+parseInt($('#o_val').val()))*/
    
})
.on('click','#o_cancel',function(){
    $('#order option').remove();$('#mobile').val('');$('#o_val').val(0);
})
.on('click','#btnMenu',function(){
    $('#dvMenu').dialog({
        width: '470',
        height: '470',
        open:function(){
            loadData();
        },
        close:function(){
            loadData();
        }
    });
})
.on('click','#M_list',function(){
	name = $('option:selected').text().split(" ")
	
    ar = $('#M_list option:selected').text().split(' ');
    $('#_name').val(ar[0])
    $('#_price').val(parseInt(ar[1]))
    $('#optype').val('update');
})
.on('click','#_clr',function(){
    $('#M_list option:selected').prop('selected',false)
    $('#_name,#_price').val('')
    $('#optype').val('add');
})
.on('click','#_add',function(){
	let sq_num = $('#M_list option:selected').val();
    if($('#M_list option:selected').prop('selected')==true){
        if($('#_name').val()==''||$('#_price').val()==''||$('#_name').val().indexOf(' ')>-1||$('#_price').val().indexOf(' ')>-1){
            alert('정상적인 값을 입력해 주세요.\n띄어쓰기는 안됩니다.')
            return false;
        }
        else
        	console.log(sq_num,$('#_name').val(),$('#_price').val());
        	$.ajax({
        		type:'get',
        		url:'modify',
        		data:'sq_num='+sq_num+'&name='+$('#_name').val()+'&price='+$('#_price').val(),
        		dataType:'text',
        		success:function(){
        			loadData();
        		},
        		error:function(){
        		},
        		complete:function(){
        		}
        		
        	})
        }
    else{
        if($('#_name').val()==''||$('#_price').val()==''||$('#_name').val().indexOf(' ')>-1||$('#_price').val().indexOf(' ')>-1){
        	alert('정상적인 값을 입력해 주세요.\n띄어쓰기는 안됩니다.')
            return false;
        }
        else
        	$.ajax({
        		type:'get',
        		url:'insert',
        		data:'name='+$('#_name').val()+'&price='+$('#_price').val(),
        		dataType:'text',
        		success:function(data){
        			loadData();
        		},
        		error:function(){
        		},
        		complete:function(){
        		}
        		
        		
        	})
        }
    if($('#_name').val()==''||$('#_price').val()==''||$('#_name').val().indexOf(' ')>-1||$('#_price').val().indexOf(' ')>-1){
        alert('정상적인 값을 입력해 주세요.\n띄어쓰기는 안됩니다.')
        return false;
    }
    $('#_clr').trigger('click');
})
.on('click','#_del',function(){
	let id = $('option:selected').val();
	console.log(id);
	$.ajax({
		type:'get',
		url:'remove',
		data:'id='+id,
		dataType:'text',
		success:function(){
			$('option:selected').remove();
		},
		error:function(){
		},
		complete:function(){
		}
		
		
	})
    $('#M_list option:selected').remove();
    $('#_clr').trigger('click');
})
.on('click','#_exit',function(){
    $('#dvMenu').dialog('close')
    loadData();
})

function loadData(){
	$.ajax({
     	type:'get',
			url:'menu',
			dataType:'json',
			success:function(data){
				$('#menu').empty();
				$('#M_list').empty();
				console.log(data);
				for(let i=0;i<data.length;i++){
					let jo=data[i];
					let str='<option value='+jo['seqno']+'>'+jo['name']+' '+jo['price']+'</option>'
					$('#menu').append(str);$('#M_list').append(str);
				}
			},
			error:function(){
			},
			complete:function(){
			}
     	
     })
}
function selData(){
	$.ajax({
		type:'get',
		url:'seltbl',
		dataType:'json',
		success:function(data){
			$('#Result').empty();
			sum=0;
			for(let i=0;i<data.length;i++){
				let jo = data[i];
				console.log(jo)
				let str = '<option>'+jo['mobile']+' '+jo['seqno']+' '+jo['qty']+' '+jo['price']+' '+jo['date']+'</option>'
				$('#Result').append(str);
				sum +=parseInt(jo['price']);
    			$('#sum').text(sum); 
			}
			//$('#Result').empty().append(data);
			
			/*for(i=0;i<$('#Result option').length;i++){
				Rs_sum=$('#Result option:eq('+i+')').text().split(" ");
				
			}*/
    		
		},
		error:function(){
		},
		complete:function(){
		}
	})
}
</script>
</html>
