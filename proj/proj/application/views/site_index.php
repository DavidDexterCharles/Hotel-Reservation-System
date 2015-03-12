<html>
    <head>
        <title>jQuery Ajax tutorial using Code Igniter Framework</title>
     
        <script type="text/javascript" src="<?php echo base_url(); ?>/js/jqBarGraph.1.1.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                var arrayOfPHPData = <?php echo json_encode($site_graph) ?>;
                arrayOfDataJS = new Array();
                $.each(arrayOfPHPData, function (i, elem) {
                    arrayOfDataJS[i] = [parseInt(elem['location']),parseInt(elem['numBags'])];
                });
                console.log(arrayOfDataJS);
                $('#divForGraph').jqBarGraph({
                    data: arrayOfDataJS,
                    title: "This is the title and <strong>Bold</strong> is working",
                    barSpace: 20,
                    postfix: '',
                });
            });
        </script>
    </head>
     
    <body>
        <div id="wrapper">
            <div id="divForGraph"></div>
        </div>
    </body>
</html>