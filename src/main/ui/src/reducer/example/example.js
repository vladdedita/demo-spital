import {createReducer} from '../config/createReducer'
import {EXAMPLE} from '../../action/example'
const initialState = {

}
function example2(state,action){
    return {
        ..state,
        action.payload
    }
}
function example(state,action){
    return {
        ...state,
    }
}
export default createReducer(initialState, {
    [EXAMPLE]: example,
    [EXAMPLE2]: example2,
})