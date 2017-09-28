<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html><head>
 
  <link rel="stylesheet" href="resources/css_rda/common.css" type="text/css" />
<link rel="stylesheet" href="resources/css_rda/layout.css" type="text/css" />
<link rel="stylesheet" href="resources/css_rda/button.css" type="text/css" />
<link rel="stylesheet" href="resources/css_rda/table.css" type="text/css" />
<link rel="stylesheet" href="resources/css_rda/box.css" type="text/css" />
<link rel="stylesheet" href="resources/css_rda/searchbox.css" type="text/css" />
<link rel="stylesheet" href="resources/css_rda/jquery-ui.css" type="text/css" />
<link rel="stylesheet" href="resources/css_rda/navigation.css"
	type="text/css" />
<link rel="stylesheet" href="resources/css_rda/location.css" type="text/css" />


<script type="text/javascript" src="resources/js_rda/common.js"></script>
<script type="text/javascript" src="resources/js_rda/jquery-1.4.1.js"></script>
<script type="text/javascript" src="resources/js_rda/jquery-ui.js"></script>
                
	<script type="text/JavaScript">
     	function add() {
     		
     		var ydate =	$("#ydate option:selected").val();
    	 	var mdate = $("#mdate option:selected").val();
    	 	var ddate =$("#ddate option:selected").val();
    	   var tdate =$("#tdate option:selected").val();
    		if (ydate=="" ){	alert("년도를 입력해주세요");	return false}	
    		if (mdate=="" ){	alert("월을 입력해주세요");	return false}
    		if (ddate=="" ){	alert("일을 입력해주세요");	return false}
    		if (tdate=="" ){	alert("시간을 입력해주세요");	return false}
    	    var ydate1 =	$("#ydate1 option:selected").val();
    		var mdate1 = $("#mdate1 option:selected").val();
    		var ddate1 =$("#ddate1 option:selected").val();
    	   var tdate1 =$("#tdate1 option:selected").val();
    		if (ydate1=="" ){	alert("년도를 입력해주세요");	return false}	
    		if (mdate1=="" ){	alert("월을 입력해주세요");	return false}
    		if (ddate1=="" ){	alert("일을 입력해주세요");	return false}
    		if (tdate1=="" ){	alert("시간을 입력해주세요");	return false}
     		
     		
     		var f = document.regForm;
     		var chk = document.getElementById('FECES_IMAGE'); 
     		if(!chk.value){
			alert("이미지를 넣어주시기 바랍니다")
			}else {
     			if(confirm("등록하시겠습니까?")) {
				$('#regForm').submit();
     			}
			}
		}
     	
     	function insert(){

    
         		var f = document.regForm;
         		var chk = document.getElementById('FECES_IMAGE'); 
         		if(!chk.value){
    			alert("이미지를 넣어주시기 바랍니다")
    			}else {
         			if(confirm("등록하시겠습니까?")) {
    				$('#regForm').submit();
         			}
    			 
    		}
         	
         	
    	
     		if(confirm("입력하시겠습니까?")) {
     			var errormsg = 0;
     			 var form = $('#regForm')[0];
     			 var quresearch = new FormData(form);
 
     		         	 console.log(quresearch);
     					$.ajax({
     						url : "${pageContext.request.contextPath }/ajax/feseEntityInsertDo",
     						type : "POST",
     						 data : quresearch,
     						success : function(data) {
     			            	alert('성공적으로 입력하였습니다.');
 
     						},
     							complete : function() {
     					   
      					       window.close();
      					    }
 
     				 
     					});
     		}
     	}
     	
     	function insert1(){
 
         document.regForm.submit(function(event){
            alert("전송완료입니다.");
             return true;   }
              );
       }
    	function  winclose(){
     	
     	  window.close();
    	}
	</script> 
   
    		       
                
	<title>과거 병력 정보 입력</title>
	<style id="style-1-cropbar-clipper">/* Copyright 2014 Evernote Corporation. All rights reserved. */
.en-markup-crop-options {
    top: 18px !important;
    left: 50% !important;
    margin-left: -100px !important;
    width: 200px !important;
    border: 2px rgba(255,255,255,.38) solid !important;
    border-radius: 4px !important;
}

.en-markup-crop-options div div:first-of-type {
    margin-left: 0px !important;
}
</style></head>
    
    
		
		
<body>
<br>




<div align="left" style="padding-bottom: 5px">
	<font style="color:#000000; font-family:gulim; font-size:14px;"><b><img src="resources/images/icon/board.png" style="width:20px; position:relative; top:0.2em"> 분변자료입력</b></font>
</div>	
<table class="table_003 w100p">
<!-- <form id="regForm" name="regForm" method="post" style="margin-left: 10px; margin-right: 10px" action="/ajax/feseEntityInsertDo?entity_id=005107&amp;keyvalue=multipart" enctype="multipart/form-data"> -->
<!-- <form id="regForm" name="regForm" method="post" style="margin-left: 10px; margin-right: 10px"   enctype="multipart/form-data"> -->
<form id="regForm" name="regForm" method="post" style="margin-left: 10px; margin-right: 10px" action="${pageContext.request.contextPath }/ajax/feseEntityInsertDo" enctype="multipart/form-data">
<%-- <form id="regForm" name="regForm" method="post" style="margin-left: 10px; margin-right: 10px" action="${pageContext.request.contextPath }/ajax/feseEntityInsertDoGET" enctype="multipart/form-data"> --%>

	<tbody>
		</tbody><colgroup>
			<col width="20%">
			<col width="80%">
		</colgroup>
		<tbody><tr>
			<th>관리번호</th>
			<td style="padding-left: 5px">
            	<input type="hidden" name="ENTITY_ID" id="ENTITY_ID" value="${entity_id}">
            	<input type="text" name="casenum" id="casenum" disabled="disabled" value="${entity_id}" style="background-color: #e2e2e2;"><br>
            </td>
        </tr>
		<tr>
			<th>설사 발병 일시</th>
			<td style="padding-left: 5px">
<!-- 				<input name="FECES_OCCURDATE1" id="FECES_OCCURDATE1" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 9999) { this.value = this.value.substring(0,4); } }" type="text" maxlength="4" style="width:50px; ">년 -->
<!--             	<input name="FECES_OCCURDATE2" id="FECES_OCCURDATE2" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 12) { alert('1~12 사이의 숫자로 입력바랍니다.'); } }" type="text" maxlength="2" style="width:50px;">월 -->
<!--             	<input name="FECES_OCCURDATE3" id="FECES_OCCURDATE3" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 31) { alert('1~32 사이의 숫자로 입력바랍니다.'); } }" type="text" maxlength="2" style="width:50px;">일 -->
<!--             	<input name="FECES_OCCURDATE4" id="FECES_OCCURDATE4" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 24) { alert('1~24 사이의 숫자로 입력바랍니다.'); } }" type="text" maxlength="2" style="width:50px;">시 -->
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
			<th>채취 일시</th>
			<td style="padding-left: 5px">
<!-- 				<input name="FECES_GATHERDATE1" id="FECES_GATHERDATE1" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 9999) { this.value = this.value.substring(0,4); } }" type="text" maxlength="4" style="width:50px; ">년 -->
<!--             	<input name="FECES_GATHERDATE2" id="FECES_GATHERDATE2" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 12) { alert('1~12 사이의 숫자로 입력바랍니다.'); } }" type="text" maxlength="2" style="width:50px;">월 -->
<!--             	<input name="FECES_GATHERDATE3" id="FECES_GATHERDATE3" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 31) { alert('1~32 사이의 숫자로 입력바랍니다.'); } }" type="text" maxlength="2" style="width:50px;">일 -->
<!--             	<input name="FECES_GATHERDATE4" id="FECES_GATHERDATE4" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 24) { alert('1~24 사이의 숫자로 입력바랍니다.'); } }" type="text" maxlength="2" style="width:50px;">시 -->
		<select name="ydate1" id="ydate1">
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
<select name="mdate1" id="mdate1">
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
<select name="ddate1" id="ddate1">
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
<select name="tdate1" id="tdate1">
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
			<th>항생제 종류</th>
			<td style="padding-left: 5px">
				<input type="radio" name="ANTIBIOTICS" value="사료첨가용" style="position:relative; top:0.1em">사료첨가용&nbsp;&nbsp;
				<input type="radio" name="ANTIBIOTICS" value="치료용" style="position:relative; top:0.1em">치료용<br>
			</td>
		</tr>
		<tr>
			<th>사료 및 조사료</th>
			<td style="padding-left: 5px">
				<input type="text" name="FEED" id="FEED"><br>
			</td>
		</tr>
		<tr>
			<th>분변 이미지</th>
			<td style="padding-left: 5px">
				<input type="file" name="uploadfile" id="FECES_IMAGE"><br>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="hidden" id="mod" name="mod" value="add">
				<input type="button" value="저장" onclick="insert1()">
				<input type="reset" value="취소">
				<input type="reset" value="돌아가기" onclick="winclose()">
			</td>
		</tr>
<!-- 	</tbody> -->
</tbody>

 </form>
</table>

 
</body></html>