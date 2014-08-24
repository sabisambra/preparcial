/* ========================================================================
 * Copyright 2014 grupo1
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 grupo1

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * ========================================================================


Source generated by CrudMaker version 1.0.0.201408112050

*/

package co.edu.uniandes.csw.grupo1.curso.master.logic.dto;

import co.edu.uniandes.csw.grupo1.seccion.logic.dto.SeccionDTO;
import co.edu.uniandes.csw.grupo1.curso.logic.dto.CursoDTO;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public abstract class _CursoMasterDTO {

 
    protected CursoDTO cursoEntity;
    protected Long id;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public CursoDTO getCursoEntity() {
        return cursoEntity;
    }

    public void setCursoEntity(CursoDTO cursoEntity) {
        this.cursoEntity = cursoEntity;
    }
    
    public List<SeccionDTO> createseccion_curso;
    public List<SeccionDTO> updateseccion_curso;
    public List<SeccionDTO> deleteseccion_curso;
    public List<SeccionDTO> listseccion_curso;	
	
	
	
    public List<SeccionDTO> getCreateseccion_curso(){ return createseccion_curso; };
    public void setCreateseccion_curso(List<SeccionDTO> createseccion_curso){ this.createseccion_curso=createseccion_curso; };
    public List<SeccionDTO> getUpdateseccion_curso(){ return updateseccion_curso; };
    public void setUpdateseccion_curso(List<SeccionDTO> updateseccion_curso){ this.updateseccion_curso=updateseccion_curso; };
    public List<SeccionDTO> getDeleteseccion_curso(){ return deleteseccion_curso; };
    public void setDeleteseccion_curso(List<SeccionDTO> deleteseccion_curso){ this.deleteseccion_curso=deleteseccion_curso; };
    public List<SeccionDTO> getListseccion_curso(){ return listseccion_curso; };
    public void setListseccion_curso(List<SeccionDTO> listseccion_curso){ this.listseccion_curso=listseccion_curso; };	
	
	
}
