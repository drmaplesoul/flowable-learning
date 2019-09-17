<!DOCTYPE html>
<!-- release v5.0.7, copyright 2014 - 2019 Kartik Visweswaran -->
<!--suppress JSUnresolvedLibraryURL -->
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>文件上传</title>
    <!--<link href="bootstrap/3.2.0/css/bootstrap-theme.min.css" media="all" rel="stylesheet" type="text/css"/>-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" crossorigin="anonymous">
    <link href="/weblib/fileinput/css/fileinput.min.css" media="all" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" crossorigin="anonymous">
    <link href="/weblib/fileinput/themes/explorer-fas/theme.css" media="all" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="/weblib/jquery/jquery-1.11.1.min.js"></script>
    <!--<script type="text/javascript" src="bootstrap/3.2.0/js/bootstrap.min.js"></script>-->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="/weblib/fileinput/js/fileinput.min.js"></script>
    <script src="/weblib/fileinput/themes/fas/theme.js" type="text/javascript"></script>
    <!--<script src="fileinput/themes/explorer-fas/theme.js" type="text/javascript"></script>-->
</head>
<body>
<form enctype="multipart/form-data">
    <div class="file-loading">
        <input id="file-0a" class="file" type="file" multiple data-min-file-count="1" data-theme="fas">
    </div>
    <br>
    <button type="submit" class="btn btn-primary">Submit</button>
    <button type="reset" class="btn btn-outline-secondary">Reset</button>
</form>
</body>
</html>

