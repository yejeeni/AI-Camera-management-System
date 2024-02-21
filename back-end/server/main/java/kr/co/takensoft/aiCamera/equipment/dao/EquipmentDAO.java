package kr.co.takensoft.aiCamera.equipment.dao;


import org.apache.ibatis.annotations.Mapper;
import java.util.HashMap;
import java.util.List;


/**
 * 장비 DAO 입니다.
 *
 * @author 황대찬
 * @since 2024.01.15
 */
@Mapper
public interface EquipmentDAO {

    /**
     * 장비 등록
     *
     * @author 황대찬
     * @since 2024.01.15
     */

    public int equipmentInsert(HashMap<String, Object> params) throws Exception;

    /**
     * 장비 목록 조회
     *
     * @author 황대찬
     * @since 2024.01.15
     */
    public List<HashMap<String, Object>> equipmentSelectList(HashMap<String, Object> params) throws Exception;

    /**
     * 장비 목록 조회용 COUNT
     *
     * @author 황대찬
     * @since 2024.01.15
     */
    public int equipmentSelectListCount (HashMap<String, Object> params) throws Exception;

    /**
     * 장비 상세보기 SQL
     *
     * @author 황대찬
     * @since 2024.01.15
     */

    public HashMap<String, Object> equipmentSelectOne (HashMap<String, Object> params) throws Exception;

    /**
     * 장비 수정
     *
     * @author 황대찬
     * @since 2024.01.15
     */
    public int equipmentUpdate (HashMap<String, Object> params) throws Exception;

    /**
     * 장비 삭제
     *
     * @author 황대찬
     * @since 2024.01.15
     */

    public int equipmentDelete (HashMap<String, Object> params) throws Exception;

    /**
     * 장애 유무를 포함한 장비 목록 조회
     *
     * @author 김예진
     * @since 2024.02.01
     */
    public List<HashMap<String, Object>> eqpmnSelectListIncludeTroblYN(HashMap<String, Object> params) throws Exception;

}
