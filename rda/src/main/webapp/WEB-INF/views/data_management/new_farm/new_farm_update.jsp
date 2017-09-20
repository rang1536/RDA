<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="../../module/top_menu.jsp"></c:import>
<c:import url="../../module/side_data_management.jsp"></c:import>
<script>


// 	function add() {
// 		var f = document.regForm;
// 	    console.log(f);
// 	if(confirm("등록하시겠습니까?")) {
// //			$('#regForm').submit();
// 		f.submit();
// 	}
// }
 
//  $(document).ready(function(){
	 $(document).ready(function(){
		 var DIARRHEADO="${EntityList.getDIARRHEADO()}";
 
		 var CHCYN="${EntityList.getCHCYN()}";
 
		 var VETERINARIAN="${EntityList.getVETERINARIAN()}";

// 		 $('input:radio[name=FARM_ID]:input[value=' +FARM_ID+ ']').attr("checked", true);
// 		 $('input:radio[name=FARM_NAME]:input[value=' +FARM_NAME+ ']').attr("checked", true);
// 		 $('input:radio[name=ADDRESS]:input[value=' +ADDRESS+ ']').attr("checked", true);
// 		 $('input:radio[name=HP1]:input[value=' +HP1+ ']').attr("checked", true);
// 		 $('input:radio[name=HP2]:input[value=' +HP2+ ']').attr("checked", true);
// 		 $('input:radio[name=HP3]:input[value=' +HP3+ ']').attr("checked", true);
// 		 $('input:radio[name=PHONE1]:input[value=' +PHONE1+ ']').attr("checked", true);
// 		 $('input:radio[name=PHONE2]:input[value=' +PHONE2+ ']').attr("checked", true);
// 		 $('input:radio[name=PHONE3]:input[value=' +PHONE3+ ']').attr("checked", true);
// 		 $('input:radio[name=EMAIL]:input[value=' +EMAIL+ ']').attr("checked", true);
// 		 $('input:radio[name=NAME]:input[value=' +NAME+ ']').attr("checked", true);
// 		 $('input:radio[name=MC]:input[value=' +MC+ ']').attr("checked", true);
// 		 $('input:radio[name=CMONEY]:input[value=' +CMONEY+ ']').attr("checked", true);
// 		 $('input:radio[name=CHC]:input[value=' +CHC+ ']').attr("checked", true);
// 		 $('input:radio[name=CAREER]:input[value=' +CAREER+ ']').attr("checked", true);
// 		 $('input:radio[name=DIARRHEA]:input[value=' +DIARRHEA+ ']').attr("checked", true);
		 $('input:radio[name=DIARRHEADO]:input[value=' +DIARRHEADO+ ']').attr("checked", true);
// 		 $('input:radio[name=CHCDIE]:input[value=' +CHCDIE+ ']').attr("checked", true);
 	 $('input:radio[name=CHCYN]:input[value=' +CHCYN+ ']').attr("checked", true);
// 		 $('input:radio[name=KMKC]:input[value=' +KMKC+ ']').attr("checked", true);
// 		 $('input:radio[name=KMPI]:input[value=' +KMPI+ ']').attr("checked", true);
// 		 $('input:radio[name=KMMC]:input[value=' +KMMC+ ']').attr("checked", true);
// 		 $('input:radio[name=KMETC]:input[value=' +KMETC+ ']').attr("checked", true);
// 		 $('input:radio[name=YEAR]:input[value=' +YEAR+ ']').attr("checked", true);
// 		 $('input:radio[name=DISINFECTANT]:input[value=' +DISINFECTANT+ ']').attr("checked", true);
// 		 $('input:radio[name=TEMP]:input[value=' +TEMP+ ']').attr("checked", true);
// 		 $('input:radio[name=HUMIDITY]:input[value=' +HUMIDITY+ ']').attr("checked", true);
// 		 $('input:radio[name=ILLUMINANCE]:input[value=' +ILLUMINANCE+ ']').attr("checked", true);
// 		 $('input:radio[name=WIND]:input[value=' +WIND+ ']').attr("checked", true);
// 		 $('input:radio[name=JANITOR]:input[value=' +JANITOR+ ']').attr("checked", true);
		 $('input:radio[name=VETERINARIAN]:input[value=' +VETERINARIAN+ ']').attr("checked", true);
// 		 $('input:radio[name=INPUTDATE]:input[value=' +INPUTDATE+ ']').attr("checked", true);
// 		 $('input:radio[name=UPDATEDATE]:input[value=' +UPDATEDATE+ ']').attr("checked", true);
// 		 $('input:radio[name=CU_NUM]:input[value=' +CU_NUM+ ']').attr("checked", true);
// 		 $('input:radio[name=SEQNO]:input[value=' +SEQNO+ ']').attr("checked", true);
// 		 $('input:radio[name=ADDRESS1]:input[value=' +ADDRESS1+ ']').attr("checked", true);
// 		 $('input:radio[name=ADDRESS2]:input[value=' +ADDRESS2+ ']').attr("checked", true);
// 		 $('input:radio[name=ADDRESS3]:input[value=' +ADDRESS3+ ']').attr("checked", true);

		 
		 
	 });
	 
	 
	 
	function farmUpdate() {
		if(confirm("수정하시겠습니까?")) {
			//var farm = $('#regForm').serialize();
			   
			  var obj = new Object();	
			  
			  obj.FARM_ID=$("#FARM_ID").val();
			  obj.FARM_NAME=$("#FARM_NAME").val();
			  obj.ADDRESS=$("#ADDRESS").val();
			  obj.HP1=$("#HP1").val();
			  obj.HP2=$("#HP2").val();
			  obj.HP3=$("#HP3").val();
			  obj.PHONE1=$("#PHONE1").val();
			  obj.PHONE2=$("#PHONE2").val();
			  obj.PHONE3=$("#PHONE3").val();
			  obj.EMAIL=$("#EMAIL").val();
			  obj.NAME=$("#NAME").val();
			  obj.MC=$("#MC").val();
			  obj.CMONEY=$("#CMONEY").val();
			  obj.CHC=$("#CHC").val();
			  obj.CAREER=$("#CAREER").val();
			  obj.DIARRHEA=$("#DIARRHEA").val();
			  obj.DIARRHEADO=$("#DIARRHEADO").val(); 
			  obj.CHCDIE=$("#CHCDIE").val();
			  obj.KMKC=$("#KMKC").val();
			  obj.KMPI=$("#KMPI").val();
			  obj.KMMC=$("#KMMC").val();
			  obj.KMETC=$("#KMETC").val();
		//	  obj.YEAR=$(':radio[name="YEAR"]:checked').val();
			  obj.DISINFECTANT=$("#DISINFECTANT").val();
			  obj.TEMP=$("#TEMP").val();
			  obj.HUMIDITY=$("#HUMIDITY").val();
			  obj.ILLUMINANCE=$("#ILLUMINANCE").val();
			  obj.WIND=$("#WIND").val();
			  obj.JANITOR=$("#JANITOR").val();
			 // obj.VETERINARIAN=$(':radio[name="VETERINARIAN"]:checked').val();

// 			  obj.INPUTDATE=$("#INPUTDATE").val();
// 			  obj.UPDATEDATE=$("#UPDATEDATE").val();
// 			  obj.CU_NUM=$("#CU_NUM").val();
// 			  obj.SEQNO=$("#SEQNO").val();			
obj.ADDRESS1=$("#ADDRESS1").val();
obj.ADDRESS2=$("#ADDRESS2").val();
obj.ADDRESS3=$("#ADDRESS3").val();


				console.log(obj);
			  	var jsonfarm = JSON.stringify(obj);			

			console.log(jsonfarm);
			$.ajax({
				url : "${pageContext.request.contextPath }/ajax/newfarmUpdate",
				type : "POST",
				data : {
					jsonfarm:jsonfarm.toString()
           },
 		dataType : "json",
				success : function(data) {
					var result = data;
					if(result > 0){
						alert('성공적으로 수정하였습니다.');
						location.href="newFarmList";
					}else{
						alert('수정에 실패하였습니다.');
					}
				}
			})
		}
	}
	function farmDelete() {
		if(confirm("삭제하시겠습니까?")) {
			var farmId = $('#FARM_ID').val();
			$.ajax({
				url : "${pageContext.request.contextPath }/ajax/newfarmDelete",
				type : "POST",
				data : { farmId: farmId },
				dataType : "json",
				success : function(data) {
					var result = data;
					if(result > 0){
						alert('성공적으로 삭제하였습니다.');
						location.href="newFarmList";
					}else{
						alert('삭제에 실패하였습니다.');
					}
				}
			})
		}
	}
// });
 
 
</script>
<style>
.login .id, .login .pw {
    width: 110px;
    height: 20px;
}
</style>
<div id="amc_content_body" class="amc_content_body">
	
		<div align="left" style="padding-bottom: 5px">
			<font style="color: #000000; font-family: gulim; font-size: 14px;"><b><img src="/images/icon/board.png" style="width: 20px; position: relative; top: 0.2em"> 목장정보수정(${EntityList.getFARM_NAME()})</b></font>
		</div>
		<form name="regForm" method="post" style="margin-left: 20px; margin-right: 50px" action="${pageContext.request.contextPath }/ajax/newfarmUpdate">
 <input name="FARM_ID" id="FARM_ID" value="${EntityList.getFARM_ID()}" type="hidden" maxlength="100" style="width: 120px; text-align: right;">
		<table class="table_003 w100p" style="TABLE-LAYOUT: fixed;">
			<colgroup>
				<col width="10%">
				<col width="10%">
			</colgroup>
<!-- 	<form name="regForm" method="post" style="margin-left: 20px; margin-right: 50px" action=" "> -->
			<tbody>
<!-- 				<form name="regForm" method="post" style="margin-left: 20px; margin-right: 50px" action=" "> -->

				<tr>
					<th rowspan="9" width="100px">기<br>본<br>정<br>보<br></th>
				<td>농장명</td>
					<td width="500px" style="padding-left: 5px"><input name="FARM_NAME" id="FARM_NAME" value="${EntityList.getFARM_NAME()}" type="text" maxlength="100" style="width: 120px; text-align: right;"></td>
						
						
					<th rowspan="4" width="100px">2KM안 <br>우제류<br> 농가수
					</th>
					<td>한우</td>
					<td style="padding-left: 5px"><input name="KMKC" id="KMKC" value="${EntityList.getKMKC()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;"> 두</td>
				</tr>
				<tr>
					<td>농장주</td>
					<td style="padding-left: 5px"><input name="NAME" id="NAME" type="text" value="${EntityList.getNAME()}" maxlength="50" style="width: 70px; text-align: right;"></td>
					
					<td>젖소</td>
					<td style="padding-left: 5px"><input name="KMMC" id="KMMC" value="${EntityList.getKMMC()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;"> 두</td>
				</tr>
				<tr>
					<td width="10px">농장주소</td>
					<td width="500px" style="padding-left: 5px"><select name="ADDRESS" id="ADDRESS">
    <option value="" selected="selected">지역선택</option>
    <option value="경기">경기</option>
    <option value="강원">강원</option>
    <option value="충북">충북</option>
    <option value="충남">충남</option>
    <option value="전북">전북</option>
    <option value="전남">전남</option>
    <option value="경북">경북</option>
    <option value="경남">경남</option>
</select> <input name="ADDRESS1" id="ADDRESS1" type="text" value="${EntityList.getADDRESS1()}" maxlength="90" style="width: 70px; text-align: right;">(시군구) <input name="ADDRESS2" id="ADDRESS2" type="text" maxlength="90"value="${EntityList.getADDRESS2()}"style="width: 70px; text-align: right;">(읍면동) <br> <input name="ADDRESS3" id="ADDRESS3" type="text" value="${EntityList.getADDRESS3()}"maxlength="90" style="width: 400px; text-align: right;">(나머지)</td>
						
						
						
					<td>돼지</td>
					<td style="padding-left: 5px"><input name="KMPI" id="KMPI" value="${EntityList.getKMPI()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;"> 두</td>
				</tr>
				<tr>
					<td>핸드폰</td>
					<td style="padding-left: 5px"><input name="HP1" id="HP1" value="${EntityList.getHP1()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">- <input name="HP2" value="${EntityList.getHP2()}" id="HP2" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 9999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="4" style="width: 50px; text-align: right;">- <input name="HP3" value="${EntityList.getHP3()}" id="HP3" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 9999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="4" style="width: 50px; text-align: right;"></td>
					<td>기타</td>
					<td style="padding-left: 5px"><input name="KMETC" id="KMETC" value="${EntityList.getKMETC()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;"> 두</td>
				</tr>
				<tr>
					<td>농장전화번호</td>
						<td style="padding-left: 5px"><input name="PHONE1" id="PHONE1" value="${EntityList.getPHONE1()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">- <input name="PHONE2" value="${EntityList.getPHONE2()}" id="PHONE2" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 9999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="4" style="width: 50px; text-align: right;">- <input name="PHONE3" value="${EntityList.getPHONE3()}" id="PHONE3" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 9999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="4" style="width: 50px; text-align: right;"></td>
				
					<th rowspan="5">최근<br>2년안<br>전염병 현황
					</th>
					<td>설사 발생두수</td>
					<td style="padding-left: 5px"><input name="DIARRHEADO" id="DIARRHEADO" value="${EntityList.getDIARRHEADO()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">두</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td style="padding-left: 5px"><input name="EMAIL" id="EMAIL" type="text" value="${EntityList.getEMAIL()}" maxlength="20" style="width: 200px; text-align: right;"></td>
					<td>설사발생축</td>
					<td style="padding-left: 5px"><input name="DIARRHEA" id="DIARRHEA" value="${EntityList.getDIARRHEA()}" type="text" maxlength="20" style="width: 50px; text-align: right;"></td>
				</tr>
				<tr>
					<td>경력</td>
					<td style="padding-left: 5px"><input name="CAREER" id="CAREER" value="${EntityList.getCAREER()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">년</td>
					<td>송아지 폐사수</td>
					<td style="padding-left: 5px"><input name="CHCDIE" id="CHCDIE" value="${EntityList.getCHCDIE()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">두</td>
				</tr>
				<tr>
					<td>관리인수</td>
					<td style="padding-left: 5px"><input name="JANITOR" id="JANITOR" value="${EntityList.getJANITOR()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">명</td>
					<td>2년 내 법정가축<br>전염병 발생현황
					</td>
					<td style="padding-left: 5px"><input type="radio" name="YEAR" id="YEAR"value="${EntityList.getYEAR()}" style="position: relative; top: 0.1em">발생&nbsp;&nbsp; <input type="radio" name="YEAR" value="미발생" style="position: relative; top: 0.1em">미발생<br></td>
				</tr>
				<tr>
					<td>수의사 관리 여부</td>
					<td style="padding-left: 5px"><input type="radio" name="VETERINARIAN" id="VETERINARIAN" value="${EntityList.getVETERINARIAN()}" style="position: relative; top: 0.1em">관리&nbsp;&nbsp; <input type="radio" name="VETERINARIAN" value="미관리" style="position: relative; top: 0.1em">미관리<br></td>
					<td>사용 소독제 종류</td>
					<td style="padding-left: 5px"><input name="DISINFECTANT" id="DISINFECTANT" value="${EntityList.getDISINFECTANT()} " type="text" maxlength="20" style="width: 50px; text-align: right;"></td>
				</tr>
				<tr>
					<th rowspan="4">사<br>육<br>현<br>황
					</th>
					<td>어미소</td>
					<td style="padding-left: 5px"><input name="MC" id="MC" value="${EntityList.getMC()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">두</td>
					<th rowspan="4">환<br>경
					</th>
					<td>온도</td>
					<td style="padding-left: 5px"><input name="TEMP" id="TEMP" value="${EntityList.getTEMP()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">℃</td>
				</tr>
				<tr>
					<td>송아지</td>
					<td style="padding-left: 5px"><input name="CHC" id="CHC" value="${EntityList.getCHC()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">두</td>
					<td>습도</td>
					<td style="padding-left: 5px"><input name="HUMIDITY" id="HUMIDITY" value="${EntityList.getHUMIDITY()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">도</td>
				</tr>
				<tr>
					<td>육성비육</td>
					<td style="padding-left: 5px"><input name="CMONEY" id="CMONEY" value="${EntityList.getCMONEY()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">두</td>
					<td>조도</td>
					<td style="padding-left: 5px"><input name="ILLUMINANCE" id="ILLUMINANCE" value="${EntityList.getILLUMINANCE()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">Lx</td>
				</tr>
				<tr>
					<td>송아지 외부입식 여부</td>
					<td style="padding-left: 5px"><input type="radio" name="CHCYN" id="CHCYN" value="${EntityList.getCHCYN()}" style="position: relative; top: 0.1em">YES&nbsp;&nbsp; <input type="radio" name="CHCYN" value="NO" style="position: relative; top: 0.1em">NO<br></td>
					<td>풍속</td>
					<td style="padding-left: 5px"><input name="WIND" id="WIND" value="${EntityList.getWIND()}" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">m/s</td>
				</tr>
				<tr>
					<td colspan="6" align="center">
					<input type="hidden" id="mod" name="mod" value=""> 
<!-- 					<input type="button" value="수정" onclick="add()">  -->
						<input type="button" value="수정" onclick="farmUpdate()"> 
					<input type="button" value="삭제" onclick="farmDelete()"> 
					<input type="reset" value="취소"> 
					<input type="reset" value="돌아가기" onclick="history.back()">
					</td>
				</tr>
<!-- 				</form> -->
			</tbody>
<!-- 			</form>  -->
		</table>
	</form>
</div>
<c:import url="../../module/footer.jsp"></c:import>