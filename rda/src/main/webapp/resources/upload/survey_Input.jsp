<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>

<!-- <script>
	alert("설문에 응해주셔서 감사합니다");
	window.close();
</script> -->

<%
	request.setCharacterEncoding("UTF-8");
	String q7Etc = null;
	String q11 = null;
	
	//폼 입력값 받기
	String q1 = request.getParameter("localName");
	String q2 = request.getParameter("homeTown");
	String q3 = request.getParameter("age");
	String q4 = request.getParameter("q4");
	String q5 = request.getParameter("q5");
	String q6 = request.getParameter("q6");
	String q7 = request.getParameter("q7");
	if(q7.equals("4")){
		q7Etc = request.getParameter("q7Etc");
	}
	String q8 = request.getParameter("q8");
	String q9 = request.getParameter("q9");
	String q10 = request.getParameter("q10");
	if(q10.equals("1")){
		q11 = request.getParameter("q11");
	}
	System.out.println("10번값 확인 : "+q10);
	System.out.println("11번값 확인 : "+q11);
	
	final String driverClassName = "oracle.jdbc.driver.OracleDriver";
	final String url = "jdbc:oracle:thin:@192.168.0.100:1521:kis";
	final String user = "admin";
	final String relationshipwd = "sRc0488#"; 
	Connection conn = null;
	PreparedStatement pstmt = null;
	int rowCount = 0;
	String sql= null;
	
	try{
		Class.forName(driverClassName);
		conn = DriverManager.getConnection(url, user, relationshipwd);
		if(q7.equals("4") && !q10.equals("1")){
			sql = "insert into KIS_2017.JJAC_SURVEY003(SURVEY_NO,Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8,Q9,Q10,Q7ETC,REGDATE) VALUES("
					+"SEQ_SURVEY0725.NEXTVAL"
					+", '"+q1
					+"', '"+q2
					+"', '"+q3
					+"', '"+q4
					+"', '"+q5
					+"', '"+q6
					+"', '"+q7
					+"', '"+q8
					+"', '"+q9
					+"', '"+q10
					+"', '"+q7Etc
					+"', sysdate)";
		}else if(q10.equals("1") && !q7.equals("4")){
			sql = "insert into KIS_2017.JJAC_SURVEY003(SURVEY_NO,Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8,Q9,Q10,Q11,REGDATE) VALUES("
					+"SEQ_SURVEY0725.NEXTVAL"
					+", '"+q1
					+"', '"+q2
					+"', '"+q3
					+"', '"+q4
					+"', '"+q5
					+"', '"+q6
					+"', '"+q7
					+"', '"+q8
					+"', '"+q9
					+"', '"+q10
					+"', '"+q11
					+"', sysdate)";
		}else if(q7.equals("4") && q10.equals("1")){
			sql = "insert into KIS_2017.JJAC_SURVEY003(SURVEY_NO,Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8,Q9,Q10,Q11,Q7ETC,REGDATE) VALUES("
					+"SEQ_SURVEY0725.NEXTVAL"
					+", '"+q1
					+"', '"+q2
					+"', '"+q3
					+"', '"+q4
					+"', '"+q5
					+"', '"+q6
					+"', '"+q7
					+"', '"+q8
					+"', '"+q9
					+"', '"+q10
					+"', '"+q11
					+"', '"+q7Etc
					+"', sysdate)";
		}else{
			sql = "insert into KIS_2017.JJAC_SURVEY003(SURVEY_NO,Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8,Q9,Q10,REGDATE) VALUES("
					+"SEQ_SURVEY0725.NEXTVAL"
					+", '"+q1
					+"', '"+q2
					+"', '"+q3
					+"', '"+q4
					+"', '"+q5
					+"', '"+q6
					+"', '"+q7
					+"', '"+q8
					+"', '"+q9
					+"', '"+q10
					+"', sysdate)";
		}
		
		
		pstmt = conn.prepareStatement(sql);
		rowCount = pstmt.executeUpdate();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	out.print("<script>alert('설문에 응해주셔서 감사합니다')</script>");
%>
