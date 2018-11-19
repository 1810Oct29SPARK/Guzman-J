$(function nflStat() {
    var params = {
        // Request parameters
    };
  
    $.ajax({
        url: "https://api.fantasydata.net/v3/nfl/stats/JSON/TeamSeasonStats/2018?" + $.param(params),
        beforeSend: function(xhrObj){
            // Request headers
            xhrObj.setRequestHeader("Ocp-Apim-Subscription-Key","cc828a428d6140128e8042181a933617");
        },
        type: "GET",
        // Request body
        data: "{body}",
    })
    .done(function(data) {
        console.log(data);
        let nflStats = data;
        let output ='';
        $.each(nflStats, (index, sports) => {
            output +=`
         
            `;
        });
        $('#nflStatsDisplay').html(output);
    })
    .fail(function() {
        alert("error");
    });
});

    $(function mlbTeamStat() {
        var paramss = {
            // Request parameters
        };
      
        $.ajax({
            url: "https://api.fantasydata.net/v3/mlb/stats/JSON/TeamSeasonStats/2018?" + $.param(paramss),
            beforeSend: function(xhrObj){
                // Request headers
                xhrObj.setRequestHeader("Ocp-Apim-Subscription-Key","68aafb721b9f4db38fc9f64de599890c");
            },
            type: "GET",
            // Request body
            data: "{body}",
        })
        .done(function(data) {
            console.log(data);
            let mlbStats = data;
            let output='';
            $.each(mlbStats, (index, baseball) => {
                output +=`
                
                `;
            })
        
        })
        .fail(function() {
            alert("error");
        });
    });


    $(function nbaTeamStats() {
        var paramssss = {
            // Request parameters
        };
      
        $.ajax({
            url: "https://api.fantasydata.net/v3/nba/stats/JSON/TeamSeasonStats/2018?" + $.param(paramssss),
            beforeSend: function(xhrObj){
                // Request headers
                xhrObj.setRequestHeader("Ocp-Apim-Subscription-Key","e4e652fa32884b54b7deb2f8b007450b");
            },
            type: "GET",
            // Request body
            data: "{body}",
        })
        .done(function(data) {
                console.log(data);
                let nbaStat = data;
                let output='';
                $.each(nbaStat, (index, basketball) => {
                    output +=`
                    
                    `;
                })
            
        })
        .fail(function() {
            alert("error");
        });
    });

    $(function nflScheds() {
        var paramets = {
            // Request parameters
        };
      
        $.ajax({
            url: "https://api.fantasydata.net/v3/nfl/scores/JSON/Schedules/2018?" + $.param(paramets),
            beforeSend: function(xhrObj){
                // Request headers
                xhrObj.setRequestHeader("Ocp-Apim-Subscription-Key","cc828a428d6140128e8042181a933617");
            },
            type: "GET",
            // Request body
            data: "{body}",
        })
        .done(function(data) {
            console.log(data);
            let nflSchedu = data;
            let output='';
            $.each(nflSchedu, (index, footballgame) => {
                output +=`
                
                `;
            }) 
            
        })
        .fail(function() {
            alert("error");
        });
    });

    $(function nbaScheds() {
        var parae = {
            // Request parameters
        };
      
        $.ajax({
            url: "https://api.fantasydata.net/v3/nba/scores/JSON/Games/2018?" + $.param(parae),
            beforeSend: function(xhrObj){
                // Request headers
                xhrObj.setRequestHeader("Ocp-Apim-Subscription-Key","e4e652fa32884b54b7deb2f8b007450b");
            },
            type: "GET",
            // Request body
            data: "{body}",
        })
        .done(function(data) {
            console.log(data);
            let nbaSchedu = data;
            let output='';
            $.each(nbaSchedu, (index, basketballgame) => {
                output +=`
                
                `;
            }) 
            
        })
        .fail(function() {
            alert("error");
        });
    });