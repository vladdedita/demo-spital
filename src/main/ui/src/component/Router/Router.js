import React from 'react'
import {Switch, Route} from "react-router";
import asyncComponent from "../HOC/asyncComponent"

export default (props) => {
    // let asyncExampleComponent = asyncComponent( () => import ("../Example/Example"));
    return (
        <Switch>
            {/*<Route path = '/example' component={asyncExampleComponent}/>*/}
        </Switch>
    )
}