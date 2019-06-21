<%@ page import="java.util.List" %>

<%@ page import="bean.Sale" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>订单信息</title>
    <style type="text/css">
        #box-table-a
        {
            font-family: "Lucida Sans Unicode", "Lucida Grande", Sans-Serif;
            font-size: 12px;
            margin: 45px;
            width: 480px;
            text-align: left;
            border-collapse: collapse;
        }
        #box-table-a th
        {
            font-size: 13px;
            font-weight: normal;
            padding: 8px;
            background: #b9c9fe;
            border-top: 4px solid #aabcfe;
            border-bottom: 1px solid #fff;
            color: #039;
        }
        #box-table-a td
        {
            padding: 8px;
            background: #e8edff;
            border-bottom: 1px solid #fff;
            color: #669;
            border-top: 1px solid transparent;
        }
        #box-table-a tr:hover td
        {
            background: #d0dafd;
            color: #339;
        }
        body {
            margin: 0;
            padding: 0;
            background: #494A5F;
            font-weight: 500;
            font-family: "Microsoft YaHei","宋体","Segoe UI", "Lucida Grande", Helvetica, Arial,sans-serif, FreeSans, Arimo;
        }

        #container {
            width: 500px;
            height: 820px;
            margin: 0 auto;
        }
        div.search {padding: 30px 0;}

        form {
            position: relative;
            width: 300px;
            margin: 0 auto;
        }

        input, button {
            border: none;
            outline: none;
        }

        input {
            width: 100%;
            height: 42px;
            padding-left: 13px;
        }

        button {
            height: 42px;
            width: 42px;
            cursor: pointer;
            position: absolute;
        }



        .bar1 {background:  #494A5F;}

        .bar1 input {
            border: 2px solid #7BA7AB;
            border-radius: 5px;
            background: #F9F0DA;
            color: #9E9C9C;
        }
        .bar1 button {
            top: 0px;
            right: 0;
            background: #7BA7AB;
            border-radius: 5px 5px 5px 5px;

        }
        .bar1 button:before {
            content: "\f002";

            font-size: 16px;
            color: #F9F0DA;
        }


        select {
            border: solid 3px #000;

            appearance:none;
            -moz-appearance:none;
            -webkit-appearance:none;
            padding-right: 50px;
            background: url("https://raw.githubusercontent.com/ourjs/static/gh-pages/2015/arrow.png") no-repeat scroll right center transparent;
        }
        select::-ms-expand { display: none; }

        .sel{
            position:relative;
            top: 10px;
        }
        .button{
            width: 60px;
            height: 30px;
            border-radius: 5px 5px 5px 5px;
            background: #7BA7AB;
            font-size: 15px;
        }


    </style>
</head>
<body>


<div id="container">
    <div class="search bar1">
        <form action="" method="get">
            <input type="text" placeholder="请输入您要搜索的内容..." name="ser">
            <button type="submit" ></button>
            <div align="center" class="sel">
                <label >
                    <select name="row" >
                        <option >订单编号</option>
                    </select>
                </label>
            </div>

        </form>
    </div>


    <table id="box-table-a" summary="Employee Pay Sheet">
        <thead>
        <tr>
            <th scope="col">订单编号</th>
            <th scope="col">汽车名称</th>
            <th scope="col">购买数量</th>
            <th scope="col">操作一</th>
            <th scope="col">操作二</th>
        </tr>
        </thead>
        <tbody>
        <%

            List<Sale> list = (List<Sale>) request.getAttribute("list");
            for (Sale sale: list){
        %>
        <tr>

            <td><%=sale.getSale_no()%></td>
            <td><%=sale.getCar_name()%></td>
            <td><%=sale.getSale_num()%></td>

            <td><a href="Servlet_Sale_DeleteOne?id=<%=sale.getSale_no()%>">删除</a></td>
            <td><a href="Servlet_Sale_SelectOne?id=<%=sale.getSale_no()%>">更新</a></td>


        </tbody>

        <%
            }
        %>
    </table>

</div>

</body>
</html>