package ru.hackathon.aabb.advancedakbarsbank.view.dialogFragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by ILMAZ on 04.03.2017.
 */

public class ErrorDialog extends DialogFragment implements DialogInterface.OnClickListener {


    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder adb = new AlertDialog.Builder(getActivity())
                .setTitle("Wrong password")
                .setNeutralButton("OK", this)
                .setMessage("Access denied");
        return adb.create();
    }

    public void onClick(DialogInterface dialog, int which) {

    }

    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);

    }

    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
    }
}
