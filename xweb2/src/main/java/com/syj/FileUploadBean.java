package com.syj;

import java.util.Set;

import org.springframework.web.multipart.commons.CommonsMultipartFile;


/** 
 * Represents file uploaded from <a target="_blank" title="extjs" href="http://sencha.com/">extjs</a> form 
 */  
public class FileUploadBean {  
   
//    private CommonsMultipartFile file;  
    
    public CommonsMultipartFile[] uploadArray;
    
    private Set<Long> ids;

	public Set<Long> getIds() {
		return ids;
	}

	public void setIds(Set<Long> ids) {
		this.ids = ids;
	}

	public CommonsMultipartFile[] getUploadArray() {
		return uploadArray;
	}

	public void setUploadArray(CommonsMultipartFile[] uploadArray) {
		this.uploadArray = uploadArray;
	}
	
	
//	public File[] uploadArray2;
//
//	public File[] getUploadArray2() {
//		return uploadArray2;
//	}
//
//	public void setUploadArray2(CommonsMultipartFile[] uploadArray) {
//		File[] files = new File[uploadArray.length] ;
//		for(int i=0;i<uploadArray.length;i++){
//	
//				//uploadArray[i].transferTo(files[i]);
//				 files[i] = ((DiskFileItem)uploadArray[i].getFileItem()).getStoreLocation();
//		
//		}
//		
//		this.uploadArray2 = files;
//	}
   
   
//    public CommonsMultipartFile getFile() {  
//        return file;  
//    }  
//   
//    public void setFile(CommonsMultipartFile file) {  
//        this.file = file;  
//    }  
    
    
}