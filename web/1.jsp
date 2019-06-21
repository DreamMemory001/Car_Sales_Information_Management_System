<!DOCTYPE html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>

    <style type="text/css">

        #customers

        {

            font-family:"Trebuchet MS", Arial, Helvetica, sans-serif;

            width:100%;

            border-collapse:collapse;

        }



        #customers td, #customers th

        {

            font-size:1em;

            border:1px solid #000000;

            padding:3px 7px 2px 7px;

        }



        #customers th

        {
            font-size:1.1em;
            text-align:left;
            padding-top:5px;
            padding-bottom:4px;
            background-color: #f9fffb;
            color: #262626;
        }
        #customers tr.alt td
        {
            color:#000000;

            background-color: #aaa3f2;

        }

        .searchcar{
            width:616px;
            height: 38px;
            border:1px
            solid #000000;
            margin-left:
                    120px;
            margin-top: 36px;
            /* 注：出问题找浮动 */
            float:left;
        }

        .searchcar .txt{
            width:516px;
            height: 38px;
            line-height:
                    38px;
            background: #b9bbbe
            no-repeat 12px
            9px;
            /* background: palevioletred; */
            text-indent:
                    40px;
        }

        .searchcar .sub{
            width:90px;
            height: 39px;
            background: #007bff;


        }

    </style>
    <title>车辆信息</title>

</head>



<body style="background: #607B8B">

<div class="searchcar">

    <form action="" method="post">
        <input class="txt" type="text" placeholder="搜索"
        >
        <input class="sub" type="submit" >

    </form>
</div>

 <table id="customers" width="300px" >

    <tr>

        <th>Company</th>

        <th>Contact</th>

        <th>Country</th>
        <th>?</th>
        <th>22</th>
        <th>555</th>
    </tr>



    <tr>

        <td>Apple</td>

        <td>Steven Jobs</td>

        <td>USA</td>

    </tr>



    <tr class="alt">

        <td>Baidu</td>

        <td>Li YanHong</td>

        <td>China</td>

    </tr>



    <tr>

        <td>Google</td>

        <td>Larry Page</td>

        <td>USA</td>

    </tr>



    <tr class="alt">

        <td>Lenovo</td>

        <td>Liu Chuanzhi</td>

        <td>China</td>

    </tr>



    <tr>

        <td>Microsoft</td>

        <td>Bill Gates</td>

        <td>USA</td>

    </tr>



    <tr class="alt">

        <td>Nokia</td>

        <td>Stephen Elop</td>

        <td>Finland</td>

    </tr>


</table>

</body>

</html>


