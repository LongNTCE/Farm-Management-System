<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Document</title>

        <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
            crossorigin="anonymous"
        ></script>

        <!--Bootstrap 5-->
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous"
            />

        <!--Font awesome-->
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
            integrity="sha512-1ycn6IcaQQ40/MKBW2W4Rhis/DbILU74C1vSrLJxCq57o941Ym01SwNsOMqvEBFlcgUa6xLiPY/NS5R+E6ztJQ=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />
        <script src="./js/modal.js"></script>
        <script src="./js/manage.js"></script>
        <link rel="stylesheet" href="./css/manage.css" />

        <!-- Latest compiled and minified JavaScript -->
        <!--JQuery 3.6.1-->
        <script
            src="//ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"
            language="javascript"
            type="text/javascript"
        ></script>

        <script
            src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"
        ></script>
        <script
            src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"
        ></script>
    </head>
    <body>
        <div class="container mb-5">
            <jsp:include page="./navBar.jsp" />
        </div>

        <!--Main layout-->
        <div class="container mt-5">
            <div class="container dark-grey-text mt-5">
                <!--Grid row-->
       
                <div class="row wow fadeIn mt-5">
                    <div class="row mt-3">
                        <a href="facilityDetail" class="text-decoration-none"> <h6><i class="fa fa-arrow-left ms-auto" aria-hidden="true"></i>Trở về trang trước</h6> 
                        </a>
                        <h2 class="d-flex justify-content-center">Chi tiết vụ mùa</h2>
                    </div>
                    <!--Grid column-->
                    <div class="col-md-6 mb-4">
                        <!--Content-->
                        <div class="p-4">
                            <h3>${cropDetail.cropName}</h3>
                            <table class="table-borderless">

                                <tbody>
                                    <tr>

                                        <td>Ngày bắt đầu:</td>
                                        <td><b>${cropDetail.cropStartDate}</b> </td>
                                    </tr>
                                    <tr>

                                        <td>Ngày kết thúc: </td>
                                        <td><b>${cropDetail.cropEndDate}</b></td>
                                    </tr>


                                </tbody>
                            </table>


                        </div>
                        <!--Content-->
                    </div>

                    <!--Grid column-->
                    
                    
                    <c:if test="${sessionScope.acc != null}">
                    <div class="col-md-6 mt-3">

                        <h5>Lựa chọn thao tác của bạn ${sessionScope.acc}</h5>
                        <div class="row mb-2">
                            <a href="./crop_edit.jsp" type="button" class="btn btn-primary col-4 ms-3 m-1">
                                Sửa chi tiết mùa vụ
                            </a>
                            <button href="deletecrop" type="submit" class="btn btn-danger col-4 m-1"  data-bs-toggle="modal" data-bs-target="#deleteModal">
                                Xóa mùa vụ
                            </button>
                            <!--Delete Modal -->
                            <div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title" id="exampleModalLabel">Xóa mùa vụ</h5>
                                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                        </div>
                                        <div class="modal-body">
                                            Bạn có chắc chắn muốn xóa mùa vụ này hong?
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Hủy</button>
                                            <a href="deletecrop"  type="submit" class="btn btn-danger">Xóa</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="row mb-2">
                            <a href="facilityBreed_Management" type="button" class="btn btn-primary col-8 ms-3">
                                Báo cáo giống
                            </a>
                            <a href="facilityHarvest_Management" type="submit" class="btn btn-primary col-8 ms-3 mt-1">
                                Báo cáo thu hoạch
                            </a>
                            <a href="facilityInventory_Management" type="button" class="btn btn-primary col-8 ms-3 mt-1">
                                Kho của cơ sở
                            </a>

                            <a href="./manage_employee.jsp" type="button" class="btn btn-primary col-8 m-3 ms-3">
                                Quản lý nhân công
                            </a>
                            
                             <a href="./pond_add.jsp" type="button" class="btn btn-warning col-8 ms-3 mt-2">
                                Thêm ao
                            </a> 
                        </div>

                        <div class="row m">
                           
                        </div>
                    </div>
                    </c:if>
                    <!--Grid column-->
                    
                    <!--Grid column employee -->
                    <c:if test="${sessionScope.accEmp != null}">
                    <div class="col-md-6 mt-3">

                        <h5>Lựa chọn thao tác của bạn</h5>
                        

                        <div class="row mb-2">
                          <c:if test="${cropEmployeeAuthorization.allowBreedRecord == true}">
                            <a href="facilityBreed_Management" type="button" class="btn btn-primary col-8 ms-3">
                                Báo cáo giống
                            </a>
                          </c:if>
                          <c:if test="${cropEmployeeAuthorization.allowBreedRecord == false}">
                            <button href="" style="background-color: gray" class="btn btn-secondary col-8 ms-3" >
                                Báo cáo giống
                            </button>
                          </c:if>
                            
                            
                          <c:if test="${cropEmployeeAuthorization.allowHarvestRecord == true}">
          
                            <a href="facilityHarvest_Management" type="submit" class="btn btn-primary col-8 ms-3 mt-1">
                                Báo cáo thu hoạch
                            </a>
                            </c:if>
                            <c:if test="${cropEmployeeAuthorization.allowHarvestRecord == false}">
          
                            <button href="" style="background-color: gray" type="submit" class="btn btn-secondary col-8 ms-3 mt-1" >
                                Báo cáo thu hoạch
                            </button>
                            </c:if>
                            
                           
                            <c:if test="${cropEmployeeAuthorization.allowInventoryRecord == true}">
                            <a href="facilityInventory_Management" type="button" class="btn btn-primary col-8 ms-3 mt-1">
                                Kho của cơ sở
                            </a>
                            </c:if>
                            <c:if test="${cropEmployeeAuthorization.allowInventoryRecord == false}">
                            <button href="" style="background-color: gray" type="button" class="btn btn-secondary col-8 ms-3 mt-1" >
                                Kho của cơ sở
                            </button>
                            </c:if>

                        </div>
                        

                        <div class="row m">
                           
                        </div>
                    </div>
                    </c:if>
                   
                    <!--Grid column-->

                </div>
                    
                <!--Grid row-->

                <hr />

                <!--Grid row-->
                <div class="row d-flex justify-content-center wow fadeIn">
                    <!--Grid column-->
                    <div class="col-md-6 text-center">
                        <div class="row mt-3">
                            <h2 class="d-flex justify-content-center">
                                Ao trong vụ mùa này
                            </h2>
                        </div>
                    </div>
                    <!--Grid column-->
                </div>
                <!--Grid row-->

                <!--Grid row-->
                <div class="row wow fadeIn">
                    <!--Grid column-->
                    <div class="row">

                        <div class="row mt-3">
                            <c:forEach items="${listPondByCropID}" var="pc">
                                <div class="col-4 col-lg-4 ">
                                    <div class="card mb-3 farm-card">
                                        <div class="row no-gutters">
                                            <div class="col-md-4" style="max-height: 100%">
                                                <img
                                                    src="./images/jumbotron.jpg"
                                                    class="card-img"
                                                    alt="..."
                                                    />
                                            </div>
                                            <div class="col-md-8">
                                                <div class="card-body">
                                                    <h4 class="card-title">${pc.pondName}</h4>
                                                    <div class="row mt-2">
                                                        <div class="col-12">
                                                            <a
                                                                href="pondDetail?pondID=${pc.pondID}"
                                                                type="button"
                                                                class="col-12 btn btn-warning"
                                                                >
                                                                Chi tiết
                                                            </a>
                                                        </div>
                                                    </div>
                                                </div>

                                                <div></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                            </c:forEach>















                        </div>

                    </div>
                </div>
                <!--Grid row-->
            </div>
        </div>
        <!--Main layout-->

        <!--Footer-->
        <div class="container mb-5">
            <jsp:include page="./footer.jsp" />
        </div>
        <!--/.Footer-->
    </body>
</html>
