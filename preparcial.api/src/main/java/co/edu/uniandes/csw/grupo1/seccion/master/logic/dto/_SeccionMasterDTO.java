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

package co.edu.uniandes.csw.grupo1.seccion.master.logic.dto;

import co.edu.uniandes.csw.grupo1.estudiante.logic.dto.EstudianteDTO;
import co.edu.uniandes.csw.grupo1.estudiante.logic.dto.EstudianteDTO;
import co.edu.uniandes.csw.grupo1.seccion.logic.dto.SeccionDTO;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public abstract class _SeccionMasterDTO {

 
    protected SeccionDTO seccionEntity;
    protected Long id;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public SeccionDTO getSeccionEntity() {
        return seccionEntity;
    }

    public void setSeccionEntity(SeccionDTO seccionEntity) {
        this.seccionEntity = seccionEntity;
    }
    
    public List<EstudianteDTO> createenEspera_seccion;
    public List<EstudianteDTO> updateenEspera_seccion;
    public List<EstudianteDTO> deleteenEspera_seccion;
    public List<EstudianteDTO> listenEspera_seccion;	
    public List<EstudianteDTO> createinscritos_seccion;
    public List<EstudianteDTO> updateinscritos_seccion;
    public List<EstudianteDTO> deleteinscritos_seccion;
    public List<EstudianteDTO> listinscritos_seccion;	
	
	
	
    public List<EstudianteDTO> getCreateenEspera_seccion(){ return createenEspera_seccion; };
    public void setCreateenEspera_seccion(List<EstudianteDTO> createenEspera_seccion){ this.createenEspera_seccion=createenEspera_seccion; };
    public List<EstudianteDTO> getUpdateenEspera_seccion(){ return updateenEspera_seccion; };
    public void setUpdateenEspera_seccion(List<EstudianteDTO> updateenEspera_seccion){ this.updateenEspera_seccion=updateenEspera_seccion; };
    public List<EstudianteDTO> getDeleteenEspera_seccion(){ return deleteenEspera_seccion; };
    public void setDeleteenEspera_seccion(List<EstudianteDTO> deleteenEspera_seccion){ this.deleteenEspera_seccion=deleteenEspera_seccion; };
    public List<EstudianteDTO> getListenEspera_seccion(){ return listenEspera_seccion; };
    public void setListenEspera_seccion(List<EstudianteDTO> listenEspera_seccion){ this.listenEspera_seccion=listenEspera_seccion; };	
    public List<EstudianteDTO> getCreateinscritos_seccion(){ return createinscritos_seccion; };
    public void setCreateinscritos_seccion(List<EstudianteDTO> createinscritos_seccion){ this.createinscritos_seccion=createinscritos_seccion; };
    public List<EstudianteDTO> getUpdateinscritos_seccion(){ return updateinscritos_seccion; };
    public void setUpdateinscritos_seccion(List<EstudianteDTO> updateinscritos_seccion){ this.updateinscritos_seccion=updateinscritos_seccion; };
    public List<EstudianteDTO> getDeleteinscritos_seccion(){ return deleteinscritos_seccion; };
    public void setDeleteinscritos_seccion(List<EstudianteDTO> deleteinscritos_seccion){ this.deleteinscritos_seccion=deleteinscritos_seccion; };
    public List<EstudianteDTO> getListinscritos_seccion(){ return listinscritos_seccion; };
    public void setListinscritos_seccion(List<EstudianteDTO> listinscritos_seccion){ this.listinscritos_seccion=listinscritos_seccion; };	
	
	
}

