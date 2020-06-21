<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

${title }

	<table>
		<thead>
			<tr>
				<th>No. </th>
				<th>����  </th>
				<th>�۾���</th>
				<th>�ۼ���</th>
				<th>��ȸ��</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="list" items="${list }">
				<tr>
					<td>${list.idx}</td>
					<td>${list.title}</td>
					<td>${list.writer}</td>
					<td>${list.regStr}</td>
					<td>${list.viewCnt}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>