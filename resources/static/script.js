async function fetchBuses() {
    let response = await fetch('/bus');
    let buses = await response.json();
    document.getElementById('busList').innerHTML = buses.map(b => `<li>${b.route} - ${b.location}</li>`).join('');
}

async function fetchCarpools() {
    let response = await fetch('/carpool');
    let carpools = await response.json();
    document.getElementById('carpoolList').innerHTML = carpools.map(c => `<li>${c.driver} - ${c.seatsAvailable} seats at ${c.pickupLocation}</li>`).join('');
}

fetchBuses();
fetchCarpools();
