<%@ include file="./include/header.jsp"%>
<%@ include file="./include/navigation.jsp"%>
<section class="content">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-xs-12 col-md-8">
                        <div class="empty-h-20px"></div>
                    </div>
                </div>
            </div>


            <div class="container">
                <div class="row">
                    <div class="col-lg-12 col-md-12">

                        <!-- POST -->
                        <div class="post">
                            <form action="/user/login" class="form newtopic" method="post">
                                <div class="postinfotop">
                                    <h2>Log In</h2>
                                </div>

                                <!-- login section -->
                                <div class="accsection">
                                    <div class="topwrap">
                                        <div class="posttext replytext">
                                            <div>
                                                <input type="text" placeholder="User ID" name="userID" class="form-control" required />
                                            </div>
                                            <div>
                                                <input type="text" placeholder="Password" name="userPW" class="form-control" required />
                                            </div>
                                            <div class="row">
                                                <div class="make-center">
                                                    <button type="submit" class="btn btn-primary">LogIn</button>
                                                </div>
                                            </div>
                                            <div class="row">
                                            <div class="make-center" style="color:red">${userError}</div></div>
                                            <div class="clearfix"></div>
                                        </div>
                                    </div>
                                    <div class="clearfix"></div>
                                    <!-- login section END -->
                            </form>
                            </div>
                            <!-- POST -->
                        </div>
                    </div>
                </div>
        </section>
        
 <%@ include file="./include/footer.jsp"%>