package com.sprint.crm.mapper;

import com.sprint.crm.pojo.Students;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentsMapper {



    int insertSelective(Students record);


    Students selectByPrimaryKey(Integer studentId);



    int updateByPrimaryKeySelective(Students record);
    
    /**
     * ��ҳ���ݷ���
     * @param students
     * @param start
     * @param rows
     * @return
     */
    List<Students> pageData(@Param("students") Students students,@Param("start") int start,@Param("rows") int rows);
    
    /**
     * ��ҳ���������ݷ���
     * @param students
     * @param start
     * @param rows
     * @return
     */
    int pageCount(@Param("students") Students students);
    
    /**
     * ���ݶ��ѧ��id ���ظ�ѧ������
     * @param ids
     * @return ѧ������ ѧ��ID,ѧ������,��ѯʦ���� as phone
     */
    List<Students> fenpeis(@Param("ids") String ids);
    
    /**
     * ��������
     * @param ids Ҫ�޸ĵ�ѧ��id
     * @param userId ��ѯʦID
     * @return �޸�����
     */
    int updatefenpeis(@Param("ids") String ids,@Param("userId") int userId);
    /**
     * ����idɾ��
     * @param studentId
     * @return
     */
    int deleteByStudentId(@Param("studentId") Integer studentId);
    
    /**
     * ����idsɾ��
     * @param studentId
     * @return
     */
    int deleteByStudentIds(@Param("ids") String ids);
}