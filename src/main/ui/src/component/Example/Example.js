
import React, {Component} from 'react';
import {connect} from "react-redux";
import {withRouter} from "react-router";

class Example extends React.Component{

}


function mapStateToProps(state) {
    return {

    }
}

const mapDispatchToProps = {

};
export default withRouter(connect(mapStateToProps,mapDispatchToProps)(Example));
