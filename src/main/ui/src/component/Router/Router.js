import React from 'react'
import {Switch, Route} from "react-router";
import asyncComponent from "../HOC/asyncComponents"

export default (props) => {
    // let asyncBugetComponent = asyncComponent( () => import ("../Buget/Buget"));
    return (
        <Switch>
            {/*<Route path = '/utilizatori' component={asyncUtilizatorComponent}/>*/}
        </Switch>
    )
}