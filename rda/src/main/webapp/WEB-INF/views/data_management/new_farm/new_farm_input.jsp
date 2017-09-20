<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:import url="../../module/top_menu.jsp"></c:import>
<c:import url="../../module/side_data_management.jsp"></c:import>
<script>
	function newFarmAdd() {
		if(confirm("등록하시겠습니까?")) {
			var farm = $('#newFarmAddForm').serialize();
			$.ajax({
				url : "${pageContext.request.contextPath }/ajax/newFarmAdd",
				type : "POST",
				data : farm,
				dataType : "json",
				success : function(data) {
					var result = data;
					if(result > 0){
						alert('성공적으로 등록하였습니다.');
						location.href="newFarmList";
					}else{
						alert('등록에 실패하였습니다.');
					}
				}
			})
		}
	}
</script>
<div id="amc_content_body" class="amc_content_body">
	<form name="regForm" method="post" style="margin-left: 20px; margin-right: 50px" action="/dbconn/farm/input_newfarm.jsp?farm_id=0010">

		<div align="left" style="padding-bottom: 5px">
			<font style="color: #000000; font-family: gulim; font-size: 14px;"><b><img src="/images/icon/board.png" style="width: 20px; position: relative; top: 0.2em"> 목장정보입력</b></font>
		</div>
		<table class="table_003 w100p" style="TABLE-LAYOUT: fixed;">
			<colgroup>
				<col width="10%">
				<col width="10%">
			</colgroup>

			<tbody>
				

				<tr>
					<th rowspan="9" width="100px">기<br>본<br>정<br>보<br></th>
				<td>농장명</td>
					<td width="500px" style="padding-left: 5px"><input name="FARM_NAME" id="FARM_NAME" value="" type="text" maxlength="100" style="width: 120px; text-align: right;"></td>
						
						
					<th rowspan="4" width="100px">2KM안 <br>우제류<br> 농가수
					</th>
					<td>한우</td>
					<td style="padding-left: 5px"><input name="KMKC" id="KMKC" value="" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;"> 두</td>
				</tr>
				<tr>
					<td>농장주</td>
					<td style="padding-left: 5px"><input name="NAME" id="NAME" type="text" value="" maxlength="50" style="width: 70px; text-align: right;"></td>
					
					<td>젖소</td>
					<td style="padding-left: 5px"><input name="KMMC" id="KMMC" value="0" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;"> 두</td>
				</tr>
				<tr>
					<td width="10px">농장주소</td>
					<td width="500px" style="padding-left: 5px"><select name="farm_addr1">
    <option value="" selected="selected">지역선택</option>
    <option value="경기">경기</option>
    <option value="강원">강원</option>
    <option value="충북">충북</option>
    <option value="충남">충남</option>
    <option value="전북">전북</option>
    <option value="전남">전남</option>
    <option value="경북">경북</option>
    <option value="경남">경남</option>
</select> <input name="farm_addr2" id="farm_addr2" type="text" maxlength="90" style="width: 70px; text-align: right;">(시군구) <input name="farm_addr3" id="farm_addr3" type="text" maxlength="90" style="width: 70px; text-align: right;">(읍면동) <br> <input name="farm_addr4" id="farm_addr4" type="text" maxlength="90" style="width: 400px; text-align: right;">(나머지)</td>
						
						
						
					<td>돼지</td>
					<td style="padding-left: 5px"><input name="KMPI" id="KMPI" value="" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;"> 두</td>
				</tr>
				<tr>
					<td>핸드폰</td>
					<td style="padding-left: 5px"><input name="PHONE1" id="PHONE1" value="" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">- <input name="PHONE2" value="null" id="PHONE2" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 9999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="4" style="width: 50px; text-align: right;">- <input name="PHONE3" value="null" id="PHONE3" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 9999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="4" style="width: 50px; text-align: right;"></td>
					<td>기타</td>
					<td style="padding-left: 5px"><input name="KMETC" id="KMETC" value="" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;"> 두</td>
				</tr>
				<tr>
					<td>농장전화번호</td>
					<td style="padding-left: 5px"><input name="HP1" id="HP1" value="" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">- <input name="HP2" value="null" id="HP2" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 9999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="4" style="width: 50px; text-align: right;">- <input name="HP3" value="null" id="HP3" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 9999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="4" style="width: 50px; text-align: right;"></td>
					<th rowspan="5">최근<br>2년안<br>전염병 현황
					</th>
					<td>설사 발생두수</td>
					<td style="padding-left: 5px"><input name="DIARRHEADO" id="DIARRHEADO" value="" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">두</td>
				</tr>
				<tr>
					<td>이메일</td>
					<td style="padding-left: 5px"><input name="EMAIL" id="EMAIL" type="text" value="" maxlength="20" style="width: 200px; text-align: right;"></td>
					<td>설사발생축</td>
					<td style="padding-left: 5px"><input name="DIARRHEA" id="DIARRHEA" value="" type="text" maxlength="20" style="width: 50px; text-align: right;"></td>
				</tr>
				<tr>
					<td>경력</td>
					<td style="padding-left: 5px"><input name="CAREER" id="CAREER" value="" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">년</td>
					<td>송아지 폐사수</td>
					<td style="padding-left: 5px"><input name="CHCDIE" id="CHCDIE" value="" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">두</td>
				</tr>
				<tr>
					<td>관리인수</td>
					<td style="padding-left: 5px"><input name="JANITOR" id="JANITOR" value="" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">명</td>
					<td>2년 내 법정가축<br>전염병 발생현황
					</td>
					<td style="padding-left: 5px"><input type="radio" name="YEAR" value="" style="position: relative; top: 0.1em">발생&nbsp;&nbsp; <input type="radio" name="YEAR" value="미발생" style="position: relative; top: 0.1em">미발생<br></td>
				</tr>
				<tr>
					<td>수의사 관리 여부</td>
					<td style="padding-left: 5px"><input type="radio" name="VETERINARIAN" value="관리" style="position: relative; top: 0.1em">관리&nbsp;&nbsp; <input type="radio" name="VETERINARIAN" value="미관리" style="position: relative; top: 0.1em">미관리<br></td>
					<td>사용 소독제 종류</td>
					<td style="padding-left: 5px"><input name="DISINFECTANT" id="DISINFECTANT" value=" " type="text" maxlength="20" style="width: 50px; text-align: right;"></td>
				</tr>
				<tr>
					<th rowspan="4">사<br>육<br>현<br>황
					</th>
					<td>어미소</td>
					<td style="padding-left: 5px"><input name="MC" id="MC" value="" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">두</td>
					<th rowspan="4">환<br>경
					</th>
					<td>온도</td>
					<td style="padding-left: 5px"><input name="TEMP" id="TEMP" value="" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">℃</td>
				</tr>
				<tr>
					<td>송아지</td>
					<td style="padding-left: 5px"><input name="CHC" id="CHC" value="" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">두</td>
					<td>습도</td>
					<td style="padding-left: 5px"><input name="HUMIDITY" id="HUMIDITY" value="0" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">도</td>
				</tr>
				<tr>
					<td>육성비육</td>
					<td style="padding-left: 5px"><input name="CMONEY" id="CMONEY" value="" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">두</td>
					<td>조도</td>
					<td style="padding-left: 5px"><input name="ILLUMINANCE" id="ILLUMINANCE" value="" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">Lx</td>
				</tr>
				<tr>
					<td>송아지 외부입식 여부</td>
					<td style="padding-left: 5px"><input type="radio" name="CHCYN" value="YES" style="position: relative; top: 0.1em">YES&nbsp;&nbsp; <input type="radio" name="CHCYN" value="NO" style="position: relative; top: 0.1em">NO<br></td>
					<td>풍속</td>
					<td style="padding-left: 5px"><input name="WIND" id="WIND" value="" onkeyup="if ( isNaN(this.value) ) { alert('숫자만 입력가능합니다.'); this.value=''; } else { if(this.value > 999) { this.value = this.value.substring(0,4); } }" type="number" maxlength="3" style="width: 50px; text-align: right;">m/s</td>
				</tr>
				<tr>
					<td colspan="6" align="center">
					<input type="hidden" id="mod" name="mod" value=""> 
					<input type="button" value="입력" onclick="newFarmAdd()"> 
<!-- 					<input type="button" value="삭제" onclick="del()">  -->
					<input type="reset" value="취소"> 
					<input type="reset" value="돌아가기" onclick="history.back()">
					</td>
				</tr>
			</tbody>
		</table>
	</form>
</div>
<c:import url="../../module/footer.jsp"></c:import>