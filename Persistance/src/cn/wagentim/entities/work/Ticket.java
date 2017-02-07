package cn.wagentim.entities.work;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import cn.wagentim.basicutils.StringConstants;
import cn.wagentim.entities.web.IEntity;

@Entity
@Table(name="tickets")
public final class Ticket implements IEntity
{
	
	/* A */
	private String action = StringConstants.EMPTY_STRING;
	
	/* B */
	@Id
	private int number = 0;
	
	/* C */
	private String changeTS = StringConstants.EMPTY_STRING;
	
	/* I */
	private String eproject = StringConstants.EMPTY_STRING;
	
	/* J */
	private String shortText = StringConstants.EMPTY_STRING;
	
	/* K */
	private String problemDescription = StringConstants.EMPTY_STRING;
	
	/* L */
	private String analysis = StringConstants.EMPTY_STRING;
	
	/* N */
	private String functionality = StringConstants.EMPTY_STRING;
	
	/* R */
	private String faultFrequency = StringConstants.EMPTY_STRING;
	
	/* S */
	private String project = StringConstants.EMPTY_STRING;
	
	/* Y */
	private String sw = StringConstants.EMPTY_STRING;
	
	/* Z */
	private String deviceType = StringConstants.EMPTY_STRING;
	
	/* AK */
	private String rating = StringConstants.EMPTY_STRING;
	
	/* AM */
	private int status = -1;
	
	/* AN */
	private int enginerringStatus = -1;
	
	/* AO */
	private String creator = StringConstants.EMPTY_STRING;
	
	/* AP */
	private String typistUser = StringConstants.EMPTY_STRING;
	
	/* AQ */
	private String coordinator = StringConstants.EMPTY_STRING;
	
	/* AR */
	private String coordinatorUser = StringConstants.EMPTY_STRING;
	
	/* AS */
	private String spclstCo = StringConstants.EMPTY_STRING;
	
	/* AT */
	private String specialistCoordinatorUser = StringConstants.EMPTY_STRING;
	
	/* AU */
	private String responsibleProblemSolver = StringConstants.EMPTY_STRING;
	
	/* AV */
	private String responsibleProblemSolverUser = StringConstants.EMPTY_STRING;
	
	/* AW */
	private String implementationDate = StringConstants.EMPTY_STRING;
	
	/* AZ */
	private String changeTSSupplier = StringConstants.EMPTY_STRING;
	
	/* BA */
	private String supplier = StringConstants.EMPTY_STRING;
	
	/* BC */
	private String lStatus = StringConstants.EMPTY_STRING;
	
	/* BG */
	private String supplierResponse = StringConstants.EMPTY_STRING;
	
	/* BH */
	private String supplierInfo = StringConstants.EMPTY_STRING;
	
	/* BL */
	private String verificationStatus = StringConstants.EMPTY_STRING;
	
	/* BM */
	private String verificationSWVersion = StringConstants.EMPTY_STRING;
	
	/* BO */
	private String verification = StringConstants.EMPTY_STRING;

	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}

	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}

	public String getEproject()
	{
		return eproject;
	}

	public void setEproject(String eproject)
	{
		this.eproject = eproject;
	}

	public String getShortText()
	{
		return shortText;
	}

	public void setShortText(String shortText)
	{
		this.shortText = shortText;
	}

	public String getProblemDescription()
	{
		return problemDescription;
	}

	public void setProblemDescription(String problemDescription)
	{
		this.problemDescription = problemDescription;
	}

	public String getAnalysis()
	{
		return analysis;
	}

	public void setAnalysis(String analysis)
	{
		this.analysis = analysis;
	}

	public String getFunctionality()
	{
		return functionality;
	}

	public void setFunctionality(String functionality)
	{
		this.functionality = functionality;
	}

	public String getFaultFrequency()
	{
		return faultFrequency;
	}

	public void setFaultFrequency(String faultFrequency)
	{
		this.faultFrequency = faultFrequency;
	}

	public String getProject()
	{
		return project;
	}

	public void setProject(String project)
	{
		this.project = project;
	}

	public String getSw()
	{
		return sw;
	}

	public void setSw(String sw)
	{
		this.sw = sw;
	}

	public String getDeviceType()
	{
		return deviceType;
	}

	public void setDeviceType(String deviceType)
	{
		this.deviceType = deviceType;
	}

	public String getRating()
	{
		return rating;
	}

	public void setRating(String rating)
	{
		this.rating = rating;
	}

	public int getStatus()
	{
		return status;
	}

	public void setStatus(int status)
	{
		this.status = status;
	}

	public int getEnginerringStatus()
	{
		return enginerringStatus;
	}

	public void setEnginerringStatus(int enginerringStatus)
	{
		this.enginerringStatus = enginerringStatus;
	}

	public String getCreator()
	{
		return creator;
	}

	public void setCreator(String creator)
	{
		this.creator = creator;
	}

	public String getTypistUser()
	{
		return typistUser;
	}

	public void setTypistUser(String typistUser)
	{
		this.typistUser = typistUser;
	}

	public String getCoordinator()
	{
		return coordinator;
	}

	public void setCoordinator(String coordinator)
	{
		this.coordinator = coordinator;
	}

	public String getCoordinatorUser()
	{
		return coordinatorUser;
	}

	public void setCoordinatorUser(String coordinatorUser)
	{
		this.coordinatorUser = coordinatorUser;
	}

	public String getSpclstCo()
	{
		return spclstCo;
	}

	public void setSpclstCo(String spclstCo)
	{
		this.spclstCo = spclstCo;
	}

	public String getSpecialistCoordinatorUser()
	{
		return specialistCoordinatorUser;
	}

	public void setSpecialistCoordinatorUser(String specialistCoordinatorUser)
	{
		this.specialistCoordinatorUser = specialistCoordinatorUser;
	}

	public String getResponsibleProblemSolver()
	{
		return responsibleProblemSolver;
	}

	public void setResponsibleProblemSolver(String responsibleProblemSolver)
	{
		this.responsibleProblemSolver = responsibleProblemSolver;
	}

	public String getResponsibleProblemSolverUser()
	{
		return responsibleProblemSolverUser;
	}

	public void setResponsibleProblemSolverUser(String responsibleProblemSolverUser)
	{
		this.responsibleProblemSolverUser = responsibleProblemSolverUser;
	}

	public String getImplementationDate()
	{
		return implementationDate;
	}

	public void setImplementationDate(String implementationDate)
	{
		this.implementationDate = implementationDate;
	}

	public String getSupplier()
	{
		return supplier;
	}

	public void setSupplier(String supplier)
	{
		this.supplier = supplier;
	}

	public String getlStatus()
	{
		return lStatus;
	}

	public void setlStatus(String lStatus)
	{
		this.lStatus = lStatus;
	}

	public String getSupplierResponse()
	{
		return supplierResponse;
	}

	public void setSupplierResponse(String supplierResponse)
	{
		this.supplierResponse = supplierResponse;
	}

	public String getSupplierInfo()
	{
		return supplierInfo;
	}

	public void setSupplierInfo(String supplierInfo)
	{
		this.supplierInfo = supplierInfo;
	}

	public String getVerificationStatus()
	{
		return verificationStatus;
	}

	public void setVerificationStatus(String verificationStatus)
	{
		this.verificationStatus = verificationStatus;
	}

	public String getVerificationSWVersion()
	{
		return verificationSWVersion;
	}

	public void setVerificationSWVersion(String verificationSWVersion)
	{
		this.verificationSWVersion = verificationSWVersion;
	}

	public String getVerification()
	{
		return verification;
	}

	public void setVerification(String verification)
	{
		this.verification = verification;
	}

	@Override
	public Long getId()
	{
		return (long) number;
	}

	public String getChangeTS()
	{
		return changeTS;
	}

	public void setChangeTS(String changeTS)
	{
		this.changeTS = changeTS;
	}

	public String getChangeTSSupplier()
	{
		return changeTSSupplier;
	}

	public void setChangeTSSupplier(String changeTSSupplier)
	{
		this.changeTSSupplier = changeTSSupplier;
	}

	@Override
	public String toString()
	{
		return "Ticket [action=" + action + ", number=" + number + ", changeTS=" + changeTS + ", eproject=" + eproject
				+ ", shortText=" + shortText + ", problemDescription=" + problemDescription + ", analysis=" + analysis
				+ ", functionality=" + functionality + ", faultFrequency=" + faultFrequency + ", project=" + project
				+ ", sw=" + sw + ", deviceType=" + deviceType + ", rating=" + rating + ", status=" + status
				+ ", enginerringStatus=" + enginerringStatus + ", creator=" + creator + ", typistUser=" + typistUser
				+ ", coordinator=" + coordinator + ", coordinatorUser=" + coordinatorUser + ", spclstCo=" + spclstCo
				+ ", specialistCoordinatorUser=" + specialistCoordinatorUser + ", responsibleProblemSolver="
				+ responsibleProblemSolver + ", responsibleProblemSolverUser=" + responsibleProblemSolverUser
				+ ", implementationDate=" + implementationDate + ", changeTSSupplier=" + changeTSSupplier
				+ ", supplier=" + supplier + ", lStatus=" + lStatus + ", supplierResponse=" + supplierResponse
				+ ", supplierInfo=" + supplierInfo + ", verificationStatus=" + verificationStatus
				+ ", verificationSWVersion=" + verificationSWVersion + ", verification=" + verification + "]";
	}
}
