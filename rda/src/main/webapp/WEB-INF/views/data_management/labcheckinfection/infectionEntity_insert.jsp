<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="../../module/top_menu.jsp"></c:import>
<c:import url="../../module/side_data_management.jsp"></c:import>
<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/css/bootstrap.css"/>
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.15/css/dataTables.bootstrap.css"/>

        <script type="text/javascript" src="https://code.jquery.com/jquery-2.2.4.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.7/js/bootstrap.js"></script>

        <script type="text/javascript" src="https://cdn.datatables.net/1.10.15/js/jquery.dataTables.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/buttons/1.3.1/js/dataTables.buttons.min.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/buttons/1.3.1/js/buttons.bootstrap.min.js"></script>

        <script type="text/javascript" src="https://cdn.datatables.net/1.10.15/js/dataTables.bootstrap.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/buttons/1.3.1/js/buttons.html5.min.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/buttons/1.3.1/js/buttons.print.min.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/buttons/1.3.1/js/buttons.colVis.min.js"></script>
        <script type="text/javascript" src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.27/build/vfs_fonts.js"></script>
        <script type="text/javascript" src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.27/build/pdfmake.min.js"></script>
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
		        
				         
				<!--         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/meyer-reset/2.0/reset.css" > -->
				<link rel="StyleSheet" href="<c:url value='resources/css/datatable.css'/>" type="text/css">
				 <link rel="StyleSheet" href="<c:url value='resources/css/datatableUse.css'/>" type="text/css">

<style>
 div div div#content {
	
    padding-top: 10px;
    padding-left: 10px;
    padding-right: 10px;
	 
}
table tbody tr th{
	text-align:center;
}
table tbody tr td{
	text-align:left;
}

tr.bottom_button td{
	text-align:center;
}
</style>
<script type="text/javascript">
//리스트 가져와 뿌리기
$(document).ready(function(){
	
// 			$.ajax({
// 				url : "${pageContext.request.contextPath }/ajax/mhEntityUpdateSelectOne?entity_id=${entity_id}",
// 				type : "POST",
// 				success : function(data) {
//  		 console.log(data);

//  		 console.log(data.birth);
 		 
//  		 $("#cure1").val(data.cure1);				
//  		 $("#cure2").val(data.cure2);				
//  		 $("#cure3").val(data.cure3);				
//  		 $("#cure4").val(data.cure4);		
//  		 $("#occur1").val(data.occur1);				
//  		 $("#occur2").val(data.occur2);		 
//  		 $("#occur3").val(data.occur3);				
//  		 $("#occur4").val(data.occur4);		
//  		 $("#DISEASE").val(data.disease);	 
//  		 $("#PRESCRIBE").val(data.prescribe);				
//  		 $("#recov1").val(data.recov1);				
//  		 $("#recov2").val(data.recov2);		 
//  		 $("#recov3").val(data.recov3);				
//  		 $("#recov4").val(data.recov4);				
 
 		      
// 				}
// 			})
	
	
	
});



function insert(){
	var ydate =	$("#ydate option:selected").val();
 	var mdate = $("#mdate option:selected").val();
 	var ddate =$("#ddate option:selected").val();
   var tdate =$("#tdate option:selected").val();
	if (ydate=="" ){	alert("년도를 입력해주세요");	return false}	
	if (mdate=="" ){	alert("월을 입력해주세요");	return false}
	if (ddate=="" ){	alert("일을 입력해주세요");	return false}
	if (tdate=="" ){	alert("시간을 입력해주세요");	return false}
	
	
	if(confirm("입력하시겠습니까?")) {
		  
		var quresearch = $('#regForm').serialize();
 console.log(quresearch);
		$.ajax({
			url : "${pageContext.request.contextPath }/ajax/infectionEntityInsertDo",
			type : "POST",
			data : quresearch,
			dataType : "json",
			success : function(data) {
				var result = data;
				if(result > 0){
					alert('성공적으로 입력하였습니다.');
					location.href="infectionEntityListDetail?farmId=${farmId}&entity_id=${entity_id}";
				//	 window.close();
				}else{
					alert('입력에 실패하였습니다.');
				}
			}
		})
	}
}
function del() {
	if(confirm("삭제하시겠습니까?")) {
		var quresearch = $('#regForm').serialize();
		 console.log(quresearch);
				$.ajax({
					url : "${pageContext.request.contextPath }/ajax/entityEntityDeleteDo",
					type : "POST",
					data : quresearch,
					dataType : "json",
					success : function(data) {
						var result = data;
						if(result > 0){
							alert('성공적으로 삭제하셨습니다.');
//		 					location.href="farmList";
							 window.close();
						}else{
							alert('삭제에 실패하였습니다.');
						}
					}
				})
	}
}
$(document).ready(function(){
 

});


</script>

<form name="regForm" id="regForm" method="post" style="margin-left: 10px; margin-right: 10px" action="/dbconn/entity/input_entity.jsp?entity_id=009157">
<input type="hidden" id="FARM_ID" name="FARM_ID" value="${farmId}">
<input type="hidden" id="ENTITY_ID" name="ENTITY_ID" value="${entity_id}">
 
<div align="left" style="padding-bottom: 5px">
	<font style="color:#000000; font-family:gulim; font-size:14px;"><b><img src="/images/icon/board.png" style="width:20px; position:relative; top:0.2em"> 감염성원인제조사 검 사 정 보 입 력</b></font>
</div>
<table class="table_003 w100p">
	<colgroup>
		<col width="20%">
		<col width="80%">
	</colgroup>
	
	
	
		<tbody><tr>
			<th>개체 ID</th>
			<td style="padding-left: 5px">
            	<input type="text" name="entity_id" id="entity_id" disabled="disabled" value="${entity_id}" style="background-color: #e2e2e2;"><br>
            </td>
        </tr>
		<tr>
			<th>감염성원인체조사<br>분변 및 혈액 채취일</th>
			<td style="padding-left: 5px">
<!-- 				<input name="infect_gat1" id="infect_gat1" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 9999) { this.value = this.value.substring(0,4); } }" value="" type="text" maxlength="4" style="width:50px; text-align: right;">년 -->
<!--             	<input name="infect_gat2" id="infect_gat2" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 12) { alert('1~12 사이의 숫자로 입력바랍니다.'); } }" value="" type="text" maxlength="2" style="width:50px; text-align: right;">월 -->
<!--             	<input name="infect_gat3" id="infect_gat3" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 31) { alert('1~32 사이의 숫자로 입력바랍니다.'); } }" value="" type="text" maxlength="2" style="width:50px; text-align: right;">일 -->
<!--             	<input name="infect_gat4" id="infect_gat4" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 24) { alert('1~24 사이의 숫자로 입력바랍니다.'); } }" value="" type="text" maxlength="2" style="width:50px; text-align: right;">시 -->
			<select name="ydate" id="ydate">
    <option value="" selected="selected">년도선택</option>
    <option value="2017">2017년</option>
    <option value="2018">2018년</option>
    <option value="2019">2019년</option>
    <option value="2020">2020년</option>
    <option value="2021">2021년</option>
    <option value="2022">2022년</option>
    <option value="2023">2023년</option>
    <option value="2024">2024년</option>
    <option value="2025">2025년</option>
    <option value="2026">2026년</option>
    <option value="2027">2027년</option>
    <option value="2028">2028년</option>
    <option value="2029">2029년</option>
    <option value="2030">2030년</option>
</select>
<select name="mdate" id="mdate">
    <option value="" selected="selected">월 선택</option>
    <option value="01">01월</option>
    <option value="02">02월</option>
    <option value="03">03월</option>
    <option value="04">04월</option>
    <option value="05">05월</option>
    <option value="06">06월</option>
    <option value="07">07월</option>
    <option value="08">08월</option>
    <option value="09">09월</option>
    <option value="10">10월</option>
    <option value="11">11월</option>
    <option value="12">12월</option>
</select>
<select name="ddate" id="ddate">
    <option value="" selected="selected">일 선택</option>
    <option value="01">01일</option>
    <option value="02">02일</option>
    <option value="03">03일</option>
    <option value="04">04일</option>
    <option value="05">05일</option>
    <option value="06">06일</option>
    <option value="07">07일</option>
    <option value="08">08일</option>
    <option value="09">09일</option>
    <option value="10">10일</option>
    <option value="11">11일</option>
    <option value="12">12일</option>
    <option value="13">13일</option>
    <option value="14">14일</option>
    <option value="15">15일</option>
    <option value="16">16일</option>
    <option value="17">17일</option>
    <option value="18">18일</option>
    <option value="19">19일</option>
    <option value="20">20일</option>
    <option value="21">21일</option>
    <option value="22">22일</option>
    <option value="23">23일</option>
    <option value="24">24일</option>
    <option value="25">25일</option>
    <option value="26">26일</option>
    <option value="27">27일</option>
    <option value="28">28일</option>
    <option value="29">29일</option>
    <option value="30">30일</option>
    <option value="31">31일</option>
</select>
<select name="tdate" id="tdate">
    <option value="" selected="selected">시 선택</option>
    <option value="01">01시</option>
    <option value="02">02시</option>
    <option value="03">03시</option>
    <option value="04">04시</option>
    <option value="05">05시</option>
    <option value="06">06시</option>
    <option value="07">07시</option>
    <option value="08">08시</option>
    <option value="09">09시</option>
    <option value="10">10시</option>
    <option value="11">11시</option>
    <option value="12">12시</option>
    <option value="13">13시</option>
    <option value="14">14시</option>
    <option value="15">15시</option>
    <option value="16">16시</option>
    <option value="17">17시</option>
    <option value="18">18시</option>
    <option value="19">19시</option>
    <option value="20">20시</option>
    <option value="21">21시</option>
    <option value="22">22시</option>
    <option value="23">23시</option>
    <option value="24">24시</option>
</select>
			
			</td>
		</tr>
		<tr>
			<th>E-coli (K99)</th>
			<td style="padding-left: 5px">
				<input type="text" name="ECOLI" id="ECOLI" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" value="">Neg/Posi<br>
			</td>
		</tr>
		<tr>
			<th>Coronavirus</th>
			<td style="padding-left: 5px">
				<input type="text" name="CORONAVIRUS" id="CORONAVIRUS" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" value="">Neg/Posi<br>
			</td>
		</tr>
		<tr>
			<th>Rotavirus</th>
			<td style="padding-left: 5px">
				<input type="text" name="ROTAVIRUS" id="ROTAVIRUS" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" value="">Neg/Posi<br>
			</td>
		</tr>
		<tr>
			<th>Cryptosporidium</th>
			<td style="padding-left: 5px">
				<input type="text" name="CRYPTOSPORIDIUM" id="CRYPTOSPORIDIUM" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" value="">Neg/Posi<br>
			</td>
		</tr>
		<tr>
			<th>Giardia</th>
			<td style="padding-left: 5px">
				<input type="text" name="GIARDIA" id="GIARDIA" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" value="">Neg/Posi<br>
			</td>
		</tr>
		<tr>
			<th>BVD(Ag)</th>
			<td style="padding-left: 5px">
				<input type="text" name="BVDAG" id="BVDAG" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" value="">Neg/Posi<br>
			</td>
		</tr>
		<tr>
			<th>BVD(Ab)</th>
			<td style="padding-left: 5px">
				<input type="text" name="BVDAB" id="BVDAB" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" value="">Neg/Posi<br>
			</td>
		</tr>
		<tr>
			<th>Eimeria</th>
			<td style="padding-left: 5px">
				<input type="text" name="EIMERIA" id="EIMERIA" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" value="">Neg/Posi<br>
			</td>
		</tr>
		<tr>
			<th>기타 병원성 세균(salmonella, CP 등)</th>
			<td style="padding-left: 5px">
				<input type="text" name="ETC" id="ETC" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" value="">Neg/Posi<br>
			</td>
		</tr>
		<tr>
			<th>Theileria</th>
			<td style="padding-left: 5px">
				<input type="text" name="THEILERIA" id="THEILERIA" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" value="">Neg/Posi<br>
			</td>
		</tr>
				<tr>
			<th>측정 장비</th>
			<td style="padding-left: 5px">
				<input  type="text" name="EQUIPMENT" id="EQUIPMENT"><br>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
			<input type="hidden" id="mod" name="mod" value="modify">
				<input type="button" value="입력" onclick="insert()">
			 
				<input type="reset" value="취소">
			    <input type="reset" value="돌아가기" onclick="history.back()">
			</td>
		</tr>
	</tbody>
</table>
</form>
<c:import url="../../module/footer.jsp"></c:import>