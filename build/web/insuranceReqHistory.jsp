
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="./stylesheets/InsuranceHome.css" />
    </head>
    <body>
       <div id="maindiv">
      <div id="sidenav">
        <h3>Star Health Inc.</h3>
        <div id="dashboard">
          <p id="head">DASHBOARD</p>
          <a href="insuranceHomePage.jsp">
            <div class="dashboarditems" id="home">
              <i class="ri-home-5-line icons"></i>
              <p class="entries">Home</p>
            </div>
          </a>
          <a href="InsuranceClaimPage.jsp">
            <div class="dashboarditems" id="app">
              <i class="ri-health-book-line"></i>
              <p class="entries">Claim Request</p>
            </div>
          </a>
          <a href="insuranceClientsPage.jsp">
            <div class="dashboarditems" id="pat">
              <i class="ri-empathize-line"></i>
              <p class="entries">Clients</p>
            </div>
          </a>
          <a href="insuranceReqHistory.jsp">
            <div class="dashboarditems active" id="pr">
              <i class="ri-exchange-funds-line"></i>
              <p class="entries">Request History</p>
            </div>
          </a>
          <!-- <a class="card1" href="#">
            <p>Let's upgrade your plan</p>
            <img src="/12083074_Wavy_Bus-03_Single-06.png" alt="" />
            <div class="go-corner" href="#">
              <div class="go-arrow"><i class="ri-arrow-right-s-line"></i></div>
            </div>
          </a> -->
        </div>
      </div>
        <div id="comingsoon">
            <img src="./images/comingsoon_h.png">
      </div>
    </div>
    </div>
    </body>
</html>
