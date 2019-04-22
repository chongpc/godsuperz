<%@page pageEncoding="UTF-8" %>
<%@include file="util/util.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${path}/css/style.css" />
    <script>
        function showOne(id){
            var id=$("#eid"+id).text();
            var name=$("#ename"+id).text();
            var salary=$("#esalary"+id).text();
            var age=$("#eage"+id).text();
            location.href="${path}/updateEmp.jsp?id="+id+"&name="+name+"&salary="+salary+"&age="+age;
        }

        function del(id) {
            if(confirm("确定删除？"))location.href="${path}/emp/del?id="+id;
        }
    </script>
</head>
<body onload="showtime()">
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    <span id="showtime"></span>
                    <br />
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                ${user.realname}，Welcome!
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        ID
                    </td>
                    <td>
                        Name
                    </td>
                    <td>
                        Salary
                    </td>
                    <td>
                        Age
                    </td>
                    <td>
                        Operation
                    </td>
                </tr>

                <c:forEach items="${emps}" var="e" varStatus="i">
                    <tr <c:if test="${i.index%2==0}">class="row1"</c:if><c:if test="${i.index%2!=0}">class="row2"</c:if>>
                        <td id="eid${e.id}">${e.id}</td>
                        <td id="ename${e.id}">${e.name}</td>
                        <td id="esalary${e.id}">${e.salary}</td>
                        <td id="eage${e.id}">${e.age}</td>
                        <td>
                            <a href="javascript:;" onclick="del('${e.id}')">delete emp</a>&nbsp;<a href="javascript:;" onclick="showOne('${e.id}')">update emp</a>
                        </td>
                    </tr>
                </c:forEach>

            </table>
            <p>
                <input type="button" class="button" value="Add Employee" onclick="location='${path}/addEmp.jsp'"/>
            </p>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
