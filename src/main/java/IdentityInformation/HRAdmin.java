package IdentityInformation;

import EmployeeManagementPackage.Employee;
import EmployeeManagementPackage.Position;
import OrgStructurePackage.OrgStruct.OrgChart;
import OrgStructurePackage.OrgStruct.OrgUnitHead;

import java.util.*;

/**
 * @author Cobra
 */
public class HRAdmin extends Employee {

    /**
     * Default constructor
     */
    public HRAdmin() {
    }

    /**
     * 
     */
    public void createActionOnRecord() {
        // TODO implement here
    }

    /**
     * @return
     */
    public OrgChart createOrgChart() {
        // TODO implement here
        return null;
    }

    /**
     * @param orgChart 
     * @return
     */
    public OrgChart updateOrgChart(OrgChart orgChart) {
        // TODO implement here
        return null;
    }

    /**
     * @param head
     */
    public void setUnitHead(OrgUnitHead head) {
        // TODO implement here
    }

    /**
     * @param pos 
     * @param employee
     */
    public void assignPosition(Position pos, Employee employee) {
        // TODO implement here
    }

    /**
     * @param employee
     */
    public void unAssignPosition(Employee employee) {
        // TODO implement here
    }

    /**
     * 
     */
    public void createOrgUnit() {
        // TODO implement here
    }

    /**
     * 
     */
    public void dissolveOrgUnit() {
        // TODO implement here
    }

    /**
     * @param payment
     */
    public void issuePayment(Payment payment) {
        // TODO implement here
    }

    /**
     * @param mOrgUnit1 
     * @param mOrgUnit2
     */
    public void changeUnitHierachy(OrgUnit mOrgUnit1, OrgUnit mOrgUnit2) {
        // TODO implement here
    }

    /**
     * 
     */
    public void createPosition() {
        // TODO implement here
    }

    /**
     * @param pos
     */
    public void updatePosition(Position pos) {
        // TODO implement here
    }

}