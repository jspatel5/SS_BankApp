package org.asu.cse545.group4.server.requestservice.service;
import org.asu.cse545.group4.server.sharedobjects.TblRequest;
import org.asu.cse545.group4.server.sharedobjects.TblTransaction;
import java.util.List;
public abstract interface RequestService
{
  public abstract String test(String req);
  public abstract void addRequest(TblRequest request);
  public abstract void assignTo(TblRequest request);
  public abstract List<TblRequest> getPendingRequests();
  public abstract TblRequest getRequest(TblTransaction transaction);
}
