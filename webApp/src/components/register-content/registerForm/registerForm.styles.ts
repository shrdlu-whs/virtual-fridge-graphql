import { makeStyles } from "@material-ui/core";
// import { toolbarHeight } from "../header/header";

export const useStyles = makeStyles((theme) => ({
  content: {
    // height: `calc(100% - ${toolbarHeight}px)`,
    flexGrow: 1,
  },
  registerContentContainer: {
    "box-shadow": "0px 0px 32px 1px rgba(0,0,0,0.77)",
    borderRadius: 0,
    padding: theme.spacing(5, 5),
  },
  registerTitle: {
    marginTop: 0,
    textAlign: "center",
    marginBottom: theme.spacing(3),
    textTransform: "uppercase",
    paddingBottom: theme.spacing(2),
    borderBottom: `1px solid ${theme.palette.primary.main}`,
  },
  errorMessage: {
    color: theme.palette.error.main,
  },

  progressRight: {
    float: "right",
  },

  inputField: {
    marginTop: 5,
    width: "100%"
  },
  
  requestButton: {
    marginTop: 10,
    width: "100%"
  }
}));
