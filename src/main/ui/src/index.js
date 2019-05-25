import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import rootReducer from "./reducer/index";
import {applyMiddleware} from "redux";
import {createStore} from "redux/es/redux";
import {Provider} from "react-redux";
import thunk from "redux-thunk";
import axios from 'axios';
import {SnackbarProvider} from 'notistack';
import {composeWithDevTools} from 'redux-devtools-extension';

const store = createStore( rootReducer, composeWithDevTools(
    applyMiddleware(thunk),
));


axios.interceptors.response.use(response => {
    if(response.request.responseURL && response.request.responseURL.includes("/login"))
        window.location="/login";
    return response;
}, error => {
    return Promise.reject(error);
});


ReactDOM.render(
    <Provider store={store}>
        <SnackbarProvider
            anchorOrigin={{
                vertical: 'bottom',
                horizontal: 'left',
            }}
        >
            <App />
        </SnackbarProvider>
    </Provider>
    ,   document.getElementById('root'));
// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: http://bit.ly/CRA-PWA
serviceWorker.unregister();
