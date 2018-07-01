<%-- 
    Document   : WSDL_Jsp
    Created on : 28 Jun, 2018, 12:09:20 PM
    Author     : Prasanna Venkatesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body onload="pass()">
        <h1>Hello World!</h1>
        <form action ="#" method="post" id="form">
            Username: <input type="text" name="username" placeholder="Must be of length 5 to 12" maxlength="12" required/> <br/>
            <br/>
            Password: <input type="password" name="password" placeholder="Must be of length 7 to 12" required/> <br/>
            <br/>
            Name: <input type ="text" name="name" required/><br/>
            <br/>
            Address:<input type="text" name="address" /><br/>
            <br/>
            Country:<select name="country">
                <option value="India">India</option>
                <option value="USA">USA</option>
            </select><br/>
            Zipcode: <input type="text" name="pincode" required/> <br/>
            Email: <input type="text" name="email" required /><br/>
            Sex: <input type="radio" name="sex" value="Male" id="male" required/>
            <label for="male">Male</label>
            <input type="radio" name="sex" value="Female" id="fem" required />
            <label for="fem">Female</label><br/>
            Language: <input type="checkbox" name="language" value="English" id="english"  required />
            <label for="english">English</label>
            <input type="checkbox" name="language" value="Non english" id="non"  required /> 
            <label for="non">Non English</label>
            <br/>
            About: <textarea rows="10" cols="20"></textarea><br/>
            
            <p id="one" name="first"></p>
            <p id="two" name="second"></p>
            <p id="three" name="third"></p>
            Captcha: <input type="number" name="captcha" required /><br/>
            <input type="submit" value="Submit" onclick="summa()" id="butt"/><br/>
        </form>
        <script>
            var z,c,a,b;
            function pass(){
         z=Math.floor(Math.random()*4);
        switch (z) {
            case 0: c='+';
                    break;
            case 1: c='-';
                    break;
            case 2: c='*';
                    break;
            case 3: c='/';
                    break;
                default: c='+';    
        }
        document.getElementById("one").innerHTML =Math.floor(Math.random()*101);
        a=document.getElementById("one").innerHTML;
        document.getElementById("two").innerHTML =c;
        document.getElementById("three").innerHTML =Math.floor(Math.random()*101);
        b=document.getElementById("three").innerHTML;
    }
        function summa(){
            
            document.getElementById("form").action="/WSDLWebApplication/WSDL_Servlet?x="+a+"&y="+b+"&z="+c;
            document.getElementById("form").submit();
        }
        </script>
        
    <%-- start web service invocation --%><hr/>
    <%
//    try {
//	Calculator.Calculator service = new Calculator.Calculator();
//	Calculator.CalculatorSoap port = service.getCalculatorSoap();
//	 // TODO initialize WS operation arguments here
//	int intA = 0;
//	int intB = 0;
//	// TODO process result here
//	int result = port.add(intA, intB);
//	out.println("Result = "+result);
//    } catch (Exception ex) {
//	// TODO handle custom exceptions here
//    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
