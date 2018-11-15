let state = {
    Standings: ''
};


const apiUrl = 'https://api.mysportsfeeds.com/v2.0/pull/nfl/2018-regular/team={houston-texans,dallas-cowboys}/standings.json';

let getSeasonStandingsWithFetch = function(){
    fetch(apiUrl, {method: "GET", headers:{"Accept":"application/json"}})
    .then((response) => {
            return response.json();
    })
}

let state = {
    Schedule: ''
};

const apiUrl = 'https://api.mysportsfeeds.com/v2.0/pull/nfl/2018-regular/team={houston-texans,dallas-cowboys}/games.json';