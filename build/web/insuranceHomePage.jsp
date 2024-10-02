<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css"
      rel="stylesheet"
    />
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/swiper@8/swiper-bundle.min.css"
    />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap"
      rel="stylesheet"
    />
    <link rel="stylesheet" href="./stylesheets/InsuranceHome.css" />
    <link rel="icon" href="../src/imges/长.png" style="width: 30px" />
  </head>
  <body>

     <div id="maindiv">
      <div id="sidenav">
        <h3>Star Health Inc.</h3>
        <div id="dashboard">
          <p id="head">DASHBOARD</p>
          <a href="insuranceHomePage.jsp">
            <div class="dashboarditems active" id="home">
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
            <div class="dashboarditems" id="pr">
              <i class="ri-exchange-funds-line"></i>
              <p class="entries">Request History</p>
            </div>
          </a>
        </div>
      </div>
        <div id="comingsoon">
         <img src="./images/comingsoon_h.png">
      </div>
    </div>
    <script src="script.js"></script>
  </body>
</html>

