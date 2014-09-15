require.config({
    
    paths: {
        
        jquery: 'components/jquery/jquery.min',
        'bootstrap': 'components/bootstrap-3.2.0/js/bootstrap',
        'multiselect': 'components/bootstrap-multiselect/bootstrap-select',
        'dropdown': 'js/dropdown'

    },
    shim: {
        OpenLayers: {
            exports: 'OpenLayers'
        },
        'jquery-csv': [
            'jquery'
        ],
        'bootstrap': ['jquery'],
        'bootstrap-switch': ['jquery'],
        'bootstrap-timepicker': ['jquery'],
        "col-reorder-amd": {
            deps: ['jquery', 'datatables']
        },
        'datagrids/datagrids-col-vis': {
            deps: ['jquery', 'datatables']
        }
    }
});
