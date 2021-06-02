<%@ page import="java.awt.image.BufferedImage" %>
<%@ page import="com.sun.prism.Graphics" %>
<%@ page import="java.awt.*" %>
<%@ page import="java.util.Random" %>
<%@ page import="javax.imageio.ImageIO" %><%--
  Created by IntelliJ IDEA.
  User: 稍息
  Date: 2021/6/2
  Time: 8:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("gb2312");
    response.setHeader("Cache-Control","no-cache");
    int width =60,height=20;
    BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
    java.awt.Graphics g = image.getGraphics();
    g.setColor(new Color(200,200,200));
    g.fillRect( 0,0,width,height);
    Random rand = new Random();
    int randNum1 = rand.nextInt(10);
    int randNum2 = rand.nextInt(10);
    String result = String.valueOf(randNum1+randNum2); //加法验证
    String randStr= String.valueOf(randNum1)+"+"+String.valueOf(randNum2)+"=?";
    session.setAttribute("result",result);
    g.setColor(Color.black);
    g.setFont(new Font("",Font.PLAIN,20));
    g.drawString(randStr,10,17);
    for (int i=0;i<100;i++){
        int x= rand.nextInt(width);
        int y= rand.nextInt(height);
        g.drawOval(x,y,1,1);
    }
        ImageIO.write(image,"JPEG",response.getOutputStream());
    out.clear();
    out = pageContext.pushBody();

%>
</body>
</html>
