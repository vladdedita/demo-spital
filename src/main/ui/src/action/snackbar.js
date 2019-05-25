export const ENQUEUE_SNACKBAR = 'ERROR_RESPONSE';
export const REMOVE_SNACKBAR = 'SUCCESS_RESPONSE';


export function hideSnackbar (key) {

}

export function toastSuccess(message){
    return (dispatch) => {
        dispatch(enqueueSnackbar({
            message:message,
            options:{
                variant:'success'
            }
        }))
    }
}

export function toastError(error){
    let message;
    if (error && error.message)
        message = error.message;
    else if(error && error.response && error.response.data && error.response.data.message)
        message = error.response.data.message;
    else message = error;

    return (dispatch) => {
        dispatch(enqueueSnackbar({
            message:message,
            options:{
                variant:'error'
            }
        }))
    }
}

export const enqueueSnackbar = notification => {
    return {
        type: "ENQUEUE_SNACKBAR",
        notification: {
            key: new Date().getTime() + Math.random(),
            ...notification
        }
    };
};

export const removeSnackbar = key => {
    return {
        type: "REMOVE_SNACKBAR",
        key
    };
};

