import axios from 'axios';

export default axios.create({
    baseURL:'https://jsonplaceholder.typicode.com/',
    headers: {"ngrok-skip-browser-warning": "true"}
});