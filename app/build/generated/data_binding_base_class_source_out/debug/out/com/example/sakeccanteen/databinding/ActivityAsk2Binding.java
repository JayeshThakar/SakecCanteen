// Generated by view binder compiler. Do not edit!
package com.example.sakeccanteen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sakeccanteen.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAsk2Binding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button canteenstaff;

  @NonNull
  public final Button clgstaff;

  @NonNull
  public final Button student;

  private ActivityAsk2Binding(@NonNull RelativeLayout rootView, @NonNull Button canteenstaff,
      @NonNull Button clgstaff, @NonNull Button student) {
    this.rootView = rootView;
    this.canteenstaff = canteenstaff;
    this.clgstaff = clgstaff;
    this.student = student;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAsk2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAsk2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_ask2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAsk2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.canteenstaff;
      Button canteenstaff = ViewBindings.findChildViewById(rootView, id);
      if (canteenstaff == null) {
        break missingId;
      }

      id = R.id.clgstaff;
      Button clgstaff = ViewBindings.findChildViewById(rootView, id);
      if (clgstaff == null) {
        break missingId;
      }

      id = R.id.student;
      Button student = ViewBindings.findChildViewById(rootView, id);
      if (student == null) {
        break missingId;
      }

      return new ActivityAsk2Binding((RelativeLayout) rootView, canteenstaff, clgstaff, student);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
