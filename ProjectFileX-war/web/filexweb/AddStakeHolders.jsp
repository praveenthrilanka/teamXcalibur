<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="BA_SideBar.jsp" %>


<!-- START CONTENT -->
<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<script type="text/javascript">

    function f(j, num) {
        var index = document.getElementById(j).selectedIndex;
        var l;
        var k;
        for (l = j + 1; l < num; l++) {

            var op = document.getElementById(l);
            if (op.selectedIndex == index) {
                op.selectedIndex = 0;
            }
            op.options[index].style.display = 'none';
        }
    }

    function update(num) {
        var j;
        var k;

        for (j = 0; j < num; j++) {
            var op = document.getElementById(j);
            for (k = 0; k <= num; k++) {
                op.options[k].style.display = 'block';
            }
        }

        for (j = 0; j < num; j++) {
            f(j, num);
        }
    }

    function populate() {
        var s = document.getElementById('prefList').value;
        var num = document.getElementById('num').value;
        var arr = s.split(",");
        var len = arr.length;
        var i;
        for (i = 0; i < len && i < num; i++) {
            document.getElementById(i).options.selectedIndex = arr[i];
        }
        update(num);

    }
    window.onload = function () {
        populate();
        
    };
</script>

<section id="main-content" class=" ">
                <section class="wrapper" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>
				<div class="login-form" style ="">
                                        <h4>Add Stakeholders</h4>
					<h5><strong></strong></h5>

                                    
                                    <form name="addstk" action="../AddStakeholders" method="post" id="ContactForm">
                                            <%
                                                ArrayList<Employee> sh=Employee.getStakeHolders();
                                                //String prefList = s.getCompanies();
                                                //ArrayList<Company> list = CompanyDA.getCompany(s.getField()) ; 
                                                int num = sh.size();
                                                if(num==0){
                                                    out.print("Sorry. No Stake Holders are available.!");
                                                }
                                                else{
                                                    for(int i=0;i<num;i++){
                                                        //prefList=prefList.replace(list.get(i).getShortName(),""+(i+1));

                                            %>

                                           
                                                <select name="<%="selection"+i %>" id="<%=i %>" onChange="update(<%=num %>);">
                                                    <option value="0">Select</option>

                                                    <%
                                                        for(int j=0;j<num;j++){

                                                    %>

                                                    <option value =<%=sh.get(j).getEmployeeid() %> ><%=sh.get(j).getEmployeename() %> </option>
                                                    <%
                                                        }
                                                    %>
                                                </select>
                                                <input type="text" name="prio<%=i %>" size="2"/>
                                                <br/>
                                            
                                            <br/>
                                            <%
                                                   }
                                               }
                                            %>

                                            <input type="hidden" id="docno" name="docno" value="24" />

                                            <input type="submit" value="Save my selection" class="button"/>
                                        </form>
				</div>
                </section></section>

<section id="main-content" class=" ">
    <section class="wrapper" style='margin-top:6%; margin-left: 5%; display:inline-block;width:100%;padding:25px 0 0 15px;'>

         
        <div class="col-sm-10">
                
    </div>


    </section>
</section>
<!-- END CONTENT -->



<%@ include file="Down.jsp" %>