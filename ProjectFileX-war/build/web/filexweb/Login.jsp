
<!DOCTYPE html>
<html>
    <head>
        <title>FileX - Login</title>
        <link rel="shortcut icon" href="logos/fav-icon.ico" type="image/x-icon"/>
        <link href="css/stylex.css" rel="stylesheet" type="text/css" media="all" />

        <script src="js/jquery.min.js"></script>
        <script src="js/easyResponsiveTabs.js" type="text/javascript"></script>

        <script>
            function validateForm()
            {
                if (document.login.un.value === "")
                {
                    alert("User Name should not be blank..!");
                    document.srslogin.srsid.focus(null,null,document;
                    return false;
                }
                if (document.login.pw.value === "")
                {
                    alert("Password should not be blank..!");
                    document.srslogin.srsid.focus();
                    return false;
                }
            }
            
            
           history.pushState(null,null,document.URL);
                window.addEventListener('popstate',function(){
                    history.pushState(null,null,document.URL);
                    
                });
                
        </script>

    </head>
    <body>

        <div class="main">
            <br/><br/><br/><br/>
            <div class="login-form">
                <div class="sap_tabs w3ls-tabs">
                    <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">

                        <ul class="resp-tabs-list">
                            <li class=""><img src="images/logo.png" width="220px"/></li> 
                        </ul>	

                        <div class="resp-tabs-container">
                            <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
                                <div class="login-agileits-top"> 
                                    <form name="login" action="../SignIn" method="post" onsubmit="return validateForm();">
                                        <p>User Name </p>
                                        <input type="text" name="un" required=""/>
                                        <p>Password</p>
                                        <input type="password" name="pw" required=""/>	 
                                        <br/><br/>
                                        <input type="submit" value="LOGIN">
                                    </form>  
                                </div>

                            </div> 
                            <div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">

                            </div>
                        </div>							
                    </div>	 
                </div> 

                <script type="text/javascript">
                    function validateForm()
                    {
                        if (document.login.UserName.value === "")
                        {
                            alert("User Name should not be blank..!");
                            return false;
                        }
                        if (document.login.Password.value === "")
                        {
                            alert("Password should not be blank..!");
                            return false;
                        }
                    }
                    
                    
                 history.pushState(null,null,document.URL);
                 window.addEventListener('popstate',function(){
                 history.pushState(null,null,document.URL);
                    
                });
                

                    $(document).ready(function () {
                        $('#horizontalTab').easyResponsiveTabs({
                            type: 'default',
                            width: 'auto',
                            fit: true
                        });
                    });
                </script>

            </div>	
        </div>	
    </body>
</html>