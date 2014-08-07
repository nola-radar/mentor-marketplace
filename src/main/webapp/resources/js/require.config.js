require.config({
    
    paths: {
        
        jquery: '/mentormarketplace/resources/components/jquery/jquery.min',
        'bootstrap': '/mentormarketplace/resources/components/bootstrap-3.2.0/js/bootstrap',
        'multiselect': '/mentormarketplace/resources/components/bootstrap-multiselect/bootstrap-select',
        'dropdown': '/mentormarketplace/resources/js/dropdown'

    },
    shim: {
        OpenLayers: {
            exports: 'OpenLayers'
        },
        'jquery-csv': [
            'jquery'
        ],
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
