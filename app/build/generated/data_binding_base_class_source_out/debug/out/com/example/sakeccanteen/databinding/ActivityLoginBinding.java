// Generated by view binder compiler. Do not edit!
package com.example.sakeccanteen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sakeccanteen.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView Log;

  @NonNull
  public final Button Loginbtn;

  @NonNull
  public final EditText Mail;

  @NonNull
  public final TextView New;

  @NonNull
  public final EditText Pass;

  @NonNull
  public final ProgressBar Progress;

  private ActivityLoginBinding(@NonNull RelativeLayout rootView, @NonNull TextView Log,
      @NonNull Button Loginbtn, @NonNull EditText Mail, @NonNull TextView New,
      @NonNull EditText Pass, @NonNull ProgressBar Progress) {
    this.rootView = rootView;
    this.Log = Log;
    this.Loginbtn = Loginbtn;
    this.Mail = Mail;
    this.New = New;
    this.Pass = Pass;
    this.Progress = Progress;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Log;
      TextView Log = ViewBindings.findChildViewById(rootView, id);
      if (Log == null) {
        break missingId;
      }

      id = R.id.Loginbtn;
      Button Loginbtn = ViewBindings.findChildViewById(rootView, id);
      if (Loginbtn == null) {
        break missingId;
      }

      id = R.id.Mail;
      EditText Mail = ViewBindings.findChildViewById(rootView, id);
      if (Mail == null) {
        break missingId;
      }

      id = R.id.New;
      TextView New = ViewBindings.findChildViewById(rootView, id);
      if (New == null) {
        break missingId;
      }

      id = R.id.Pass;
      EditText Pass = ViewBindings.findChildViewById(rootView, id);
      if (Pass == null) {
        break missingId;
      }

      id = R.id.Progress;
      ProgressBar Progress = ViewBindings.findChildViewById(rootView, id);
      if (Progress == null) {
        break missingId;
      }

      return new ActivityLoginBinding((RelativeLayout) rootView, Log, Loginbtn, Mail, New, Pass,
          Progress);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
