<%@page pageEncoding="UTF-8" %>
<%@include file="util/util.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>login</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css"
          href="css/style.css" />
    <script>
        $(function () {
            $("#login").click(function () {
                var data=$("form").serialize();
                $.get("${path}/user/login?"+data,function (map) {
                    if(map.success)location.href="${path}/emp/showAll";
                    else alert(map.message);
                },"json");
            });
        })
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
                    <a href="${path}/emp/showAll">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                login
            </h1>
            <form action="emplist.html" method="post">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                            username:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="username" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            password:
                        </td>
                        <td valign="middle" align="left">
                            <input type="password" class="inputgri" name="password" />
                        </td>
                    </tr>
                </table>
                <p>
                    <input type="button" id="login" class="button" value="Submit &raquo;" />
                    <input type="button" class="button" onclick="location.href='${path}/regist.jsp'" value="Regist &raquo;" />
                </p>
            </form>
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
