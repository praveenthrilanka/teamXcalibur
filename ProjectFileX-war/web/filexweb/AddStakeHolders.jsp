<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Project"%>
<%@page import="org.sampath.filex.web.actions.Stakeholder"%>

<%@ include file="Up.jsp" %>
<%@ include file="SideBar_Project.jsp" %>

<!-- START CONTENT -->
<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

  <script src="js/jquery-1.11.2.min.js"></script>

                    <%
                        String srsid=(String)session.getAttribute("srsid");
                    %>

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
        <div class="login-forms" style ="">
            <h4>Add Stakeholders</h4>
                                        
                <%   
                    boolean isStkNull=false;
                    isStkNull=Project.getAddedStakeholders(pno);
                                           
                    if(isStkNull==false)
                    {
                                            
                %>
                                        
                                        
            <h5><strong>Define SRS flow</strong></h5>

                <table align="center" width="80%" style="border-collapse: separate;border-spacing: 0 1.5em;">
                    <form name="addstk" action="../AddStakeholders" method="post" id="ContactForm">
                                            
                        <tr>
                            <td><strong>Employee</strong></td>
                            <td><strong>Priority No.</strong></td>
                        </tr> 
                                            
                        <%
                            ArrayList<Employee> sh=Employee.getStakeHolders();
                                                 
                                int num = sh.size();
                                if(num==0){
                                    out.print("Sorry. No Stake Holders are available.!");
                                }
                                else{
                                    for(int i=0;i<num;i++){
                        %>
                                                  
                            <tr>
                                <td>
                                <select name="<%="selection"+i %>" id="<%=i %>" onChange="update(<%=num %>);">
                                <option value="0">Select</option>

                                <%
                                    for(int j=0;j<num;j++){

                                %>

                                <option value =<%=sh.get(j).getEmployeeid() %> ><%=sh.get(j).getEmployeename() %> (<%=sh.get(j).getDepartement() %>) </option>
                                <%
                                    }
                                %>
                                </select>
                                </td>
                                                    
                                <td>
                                <input type="text" name="prio<%=i %>" size="2"/>
                                                
                                            
                                <%
                                    }
                                    }
                                %>
                                </td>
                            </tr>
                    </table>
                    <br/><br/>
                    <input type="hidden" id="count" name="count" value="<% out.print(num); %>" />
                    <input type="hidden" id="docno" name="docno" value="<% out.print(srsid); %>" />
                    <input style="background-color:#FF9D26; border:none;" class="btn btn-info btn-block" type="submit" value="Add">
                    <br/>
                                        
                    </form>
                                                                                 
                    <%
                        }
                        else
                        {  
                    %>
                                    
                                   
                    <script type="text/javascript">
                        $(window).load(function () {
                        $('#ultraModal-11').modal('show');
                        });
                    </script>                          
                                                
                                
                    <%
                        session=request.getSession(false);
                        ArrayList<Stakeholder> stk=null;
                            
                        String p=(String)session.getAttribute("pno");
                        System.out.println("**********"+p);
                        stk=Stakeholder.getAddedStake(p);
        
                        System.out.println("Output test2");
                    %>
                                
            <table id="example-1" class="table table-striped dt-responsive display dataTable dtr-inline" cellspacing="0" width="100%" role="grid" aria-describedby="example-1_info" style="width: 100%;">

            <thead>

                <tr role="row">
                    <th class="sorting_asc" tabindex="0" rowspan="1" colspan="1"  style="width: 291px;" >Employee</th>
                    <th class="sorting" tabindex="0" rowspan="1" colspan="1" style="width: 80px;" aria-sort="ascending">Priority No</th>
                    
               </tr>
            </thead>

           
        
            <%
                Stakeholder pr;    
                for(int x=0;x<stk.size();x++){
        
                pr=stk.get(x);
           %>
      
            <tr>
            <td> <% out.print(pr.getName()); %></td>  
            <td><% out.print(pr.getPriorityno()); %></td> 
      
                  
    
            </tr>
            <% }%>
            </table>
                                    
                                
                                
                                
                <h5><strong>Update the SRS Flow</strong></h5>
                    
                    <table align="center" width="80%" style="border-collapse: separate;border-spacing: 0 1.5em;">
                        <form name="addstk" action="../AddStakeholders" method="post" id="ContactForm">
                                           
                            <tr>
                                <td><strong>Employee</strong></td>
                                <td><strong>Priority No.</strong></td>
                            </tr> 
                                          
                            <%
                                session=request.getSession(false);
                        
                                String s=(String)session.getAttribute("pno");
                                System.out.println("**********"+p);
                                            
                                ArrayList<Employee> sh=Employee.getUpdatedStakeHolders(s);
                                    int num = sh.size();
                                        if(num==0){
                                            out.print("Sorry. No Stake Holders are available.!");
                                        }
                                        else{
                                            for(int i=0;i<num;i++){
                            %>
                                                  
                            <tr>
                                <td>
                                <select name="<%="selection"+i %>" id="<%=i %>" onChange="update(<%=num %>);">
                                    <option value="0">Select</option>

                                        <%
                                            for(int j=0;j<num;j++){
                                        %>

                                    <option value =<%=sh.get(j).getEmployeeid() %> ><%=sh.get(j).getEmployeename() %> (<%=sh.get(j).getDepartement() %>) </option>
                                        <%
                                            }
                                        %>
                                </select>
                                </td>
                                <td>
                                    <input type="text" name="prio<%=i %>" size="2"/>
                                                               
                                        <%
                                            }
                                            }
                                        %>
                                </td>
                            </tr>
                        </table>
                        <br/><br/>
                        <input type="hidden" id="count" name="count" value="<% out.print(num); %>" />
                        <input type="hidden" id="docno" name="docno" value="<% out.print(srsid); %>" />
                        <input style="background-color:#FF9D26; border:none;" class="btn btn-info btn-block" type="submit" value="Add">
                        <br/>
                                        
                    </form>
                                                 
                        <%}%>        
                                    
                                    
	    </div>
        </section>
    </section>
                
            <!--Model starts-->
                <div class="modal fade" id="ultraModal-11" tabindex="-1" role="dialog" aria-labelledby="ultraModal-Label" aria-hidden="true" style="display: none;">
                    <div class="modal-dialog animated fadeInUp"><br/><br/><br/><br/><br/><br/><br/><br/><br/>
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">�</button>
                                <h4 class="modal-title">Are you sure you want to Add Stakeholders?</h4>
                            </div>
                            <div class="modal-body">
                                You have already define the path of SRS.
                            </div>
                            <div class="modal-footer">
                                <button data-dismiss="modal" class="btn btn-success" type="button">Ok</button>
                            </div>
                        </div>
                    </div>
                </div>
                            <!--model End-->
                                    
<!-- END CONTENT -->



<%@ include file="Down.jsp" %>