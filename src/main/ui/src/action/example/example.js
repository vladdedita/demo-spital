
export const EXAMPLE = 'EXAMPLE'
export function example() {
    return (dispatch,getState) => {
        dispatch({
            type: EXAMPLE,
            payload: data
        })
    }
}