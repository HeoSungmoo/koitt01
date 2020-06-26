package com.koitt.jardin.service.product;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.koitt.jardin.dao.product.ProductDAO;
import com.koitt.jardin.dto.page.ProductPageNationDTO;
import com.koitt.jardin.dto.page.ReviewPageNationDTO;
import com.koitt.jardin.dto.product.CommentDto;
import com.koitt.jardin.dto.product.ProductDTO;
import com.koitt.jardin.dto.product.ProductInfoDTO;
import com.koitt.jardin.dto.product.QnaDTO;
import com.koitt.jardin.dto.product.ReviewDTO;
import com.koitt.jardin.dto.search.SearchValue;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO productDao;

	// 제품리스트 목록페이지
	@Override
	public List<ProductDTO> list() {

		return productDao.list();
	}

	// 제품의 상세내용 ( condent_view)
	@Override
	public ProductDTO detail(int product_no) {

		return productDao.detail(product_no);
	}

	// 제품의 상세내용 // 상품상세 정보
	@Override
	public ProductInfoDTO productInfoDto(int product_no) {

		return productDao.productInfoDto(product_no);
	}

	// 제품 카테고리 리스트
	@Override
	public List<ProductDTO> categoryAllList(SearchValue sv) {

		return productDao.categoryAllList(sv);
	}

	// 제품 카테고리 리스트
	@Override
	public List<ProductDTO> categoryList(SearchValue sv) {

		return productDao.categoryList(sv);
	}

	// 제품 상품리뷰 쓰기
	@Override
	public void review(ReviewDTO reviewDto) {

		productDao.review(reviewDto);

	}

	// 제품 상품리뷰 삭제
	@Override
	public void review_delete(int review_no) {

		productDao.review_delete(review_no);

	}

	// 제품 상품리뷰 수정
	@Override
	public void review_modify(ReviewDTO reviewDto) {

		productDao.review_modify(reviewDto);
	}

	// 제품 상품리뷰 수정란 보기
	@Override
	public ReviewDTO review_modify_view(int review_no) {

		return productDao.review_modify_view(review_no);
	}

	// 제품 포토리뷰 쓰기
	@Override
	public void photo(int product_no, String title, String content, int grade, MultipartFile thumbnail, String id)
			throws Exception {

		String path = "C:/Users/user.user-PC/git/koitt01/koitt01/src/main/webapp/resources/preuserUpload/";
		String origin_Name = thumbnail.getOriginalFilename();
		// 파일명 난수 지정
		UUID uuid = UUID.randomUUID();
		String thumbNail = uuid.toString() + "_" + origin_Name;
		thumbnail.transferTo(new File(path + thumbNail));
		ReviewDTO reviewDto = new ReviewDTO();
		reviewDto.setProduct_no(product_no);
		reviewDto.setId(id);
		reviewDto.setTitle(title);
		reviewDto.setContent(content);
		reviewDto.setGrade(grade);
		reviewDto.setThumbnail(thumbNail);
		System.out.println(thumbNail);
		productDao.photo(reviewDto);

	}

	// 제품 질문과 답변 쓰기
	@Override
	public void inquiry(QnaDTO qnaDto) {
		productDao.inquiry(qnaDto);

	}

	// 제품 질문과 답변 삭제
	@Override
	public void QnA_delete(int qna_no) {

		productDao.QnA_delete(qna_no);
	}

	// 제품 질문과 답변 수정란 보기
	@Override
	public QnaDTO QnA_modify_view(int qna_no) {

		return productDao.QnA_modify_view(qna_no);
	}

	// 제품 질문과 답변 수정
	@Override
	public void QnA_modify(QnaDTO qnaDto) {

		productDao.QnA_modify(qnaDto);

	}

	// 제품 페이지네이션 페이지,게시물 수 확인
	@Override
	public ProductPageNationDTO productPageNation(SearchValue sv) {
		ProductPageNationDTO pDto = productDao.productPageNation(sv);
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

	// 제품 페이지네이션 리스트
	@Override
	public List<ProductDTO> productPageNationList(SearchValue sv) {

		return productDao.productPageNationList(sv);
	}

	// 포토상품리뷰 페이지네이션 페이지,게시물 수 확인
	@Override
	public ReviewPageNationDTO PhotoReviewPageNation(SearchValue sv) {

		ReviewPageNationDTO rDto = productDao.PhotoReviewPageNation(sv);
		rDto.setPage_cnt(rDto.getListCnt()); // 페이지 수 저장
		rDto.setRange_cnt(rDto.getPage_cnt()); // 블럭 수 저장
		rDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치 rDto.setCurpa
		rDto.setCurPage1(sv.getCurPage1());
		rDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		rDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		rDto.setStart_page(rDto.getCur_range(), rDto.getRange_size()); // 현재 블럭 시작 페이지
		rDto.setEnd_page(rDto.getCur_range(), rDto.getRange_cnt()); // 현재 블럭 끝

		return rDto;
	}

	// 포토상품리뷰 페이지네이션 리스트
	@Override
	public List<ReviewDTO> PhotoReviewPageNationList(SearchValue sv) {

		return productDao.PhotoReviewPageNationList(sv);
	}

	// 리뷰 페이지네이션 페이지,게시물 수 확인
	@Override
	public ReviewPageNationDTO ReviewPageNation(SearchValue sv) {
		ReviewPageNationDTO pDto = productDao.ReviewPageNation(sv);
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCurPage2(sv.getCurPage2());
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

	// 리뷰 페이지네이션 리스트
	@Override
	public List<ReviewDTO> ReviewPageNationList(SearchValue sv) {
		// TODO Auto-generated method stub
		return productDao.ReviewPageNationList(sv);
	}

	// 카테고리1 대분류 페이지네이션 페이지,게시물 수 확인
	@Override
	public ProductPageNationDTO categoryPageNationListDTO(SearchValue sv) {
		ProductPageNationDTO pDto = productDao.categoryPageNationListDTO(sv);
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;

	}

	// 카테고리2 대분류 페이지네이션 페이지,게시물 수 확인
	@Override
	public ProductPageNationDTO categoryPageNationDTO(SearchValue sv) {
		ProductPageNationDTO pDto = productDao.categoryPageNationDTO(sv);
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

	// 질문과 답변 페이지네이션 리스트
	@Override
	public List<QnaDTO> QnApageNationList(SearchValue sv) {

		return productDao.QnApageNationList(sv);
	}

	// 질문과 답변 페이지네이션 페이지,게시물 수 확인
	@Override
	public ReviewPageNationDTO QnApageNation(SearchValue sv) {
		ReviewPageNationDTO pDto = productDao.QnApageNation(sv);
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

	// 제품 검색 페이지네이션 리스트
	@Override
	public List<ProductDTO> productSearchPageNationList(SearchValue sv) {

		return productDao.productSearchPageNationList(sv);
	}

	// 제품 검색 페이지네이션 페이지,게시물 수 확인
	@Override
	public ProductPageNationDTO productSearchPageNation(SearchValue sv) {
		ProductPageNationDTO pDto = productDao.productSearchPageNation(sv);
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

	// 제품 검색 높은 가격순 페이지네이션 리스트
	@Override
	public List<ProductDTO> HighPircePageNationList(SearchValue sv) {
		// TODO Auto-generated method stub
		return productDao.HighPircePageNationList(sv);
	}

	// 제품 검색 낮은 가격순 페이지네이션 리스트
	@Override
	public List<ProductDTO> LowPircePageNationList(SearchValue sv) {
		// TODO Auto-generated method stub
		return productDao.LowPircePageNationList(sv);
	}

	// -------------------ajax 연습 ------------------------------------------------

	@Override
	public List<CommentDto> comment_List() {

		return productDao.comment_List();
	}

	@Override
	public void comment_delete(int cId) {

		productDao.comment_delete(cId);

	}

	@Override
	public void comment_insert(CommentDto comment) {

		productDao.comment_insert(comment);

	}

	@Override
	public void comment_update(CommentDto comment) {
		productDao.comment_update(comment);

	}
<<<<<<< HEAD

	// 제품 질문과 답변 작성란 보기
	@Override
	public List<QnaDTO> QnA_view(int product_no) {

		return productDao.QnA_view(product_no);
	}

	// 제품 질문과 답변 삭제
	@Override
	public void QnA_delete(int qna_no) {

		productDao.QnA_delete(qna_no);

	}

	// 제품 질문과 답변 수정란 보기
	@Override
	public QnaDTO QnA_modify_view(int qna_no) {

		return productDao.QnA_modify_view(qna_no);
	}

	// 제품 질문과 답변 수정
	@Override
	public void QnA_modify(QnaDTO qnaDto) {

		productDao.QnA_modify(qnaDto);

	}

	@Override
	public List<ProductDTO> product_search(String search) {

		return productDao.product_search(search);
	}

	@Override
	public ProductPageNationDTO productPageNation(SearchValue sv) {
		ProductPageNationDTO pDto = productDao.productPageNation(sv);
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

	@Override
	public List<ProductDTO> productPageNationList(SearchValue sv) {

		return productDao.productPageNationList(sv);
	}

	@Override
	public PhotoPageNationDTO PhotoReviewPageNation(SearchValue sv) {

		PhotoPageNationDTO rDto = productDao.PhotoReviewPageNation(sv);
		rDto.setPage_cnt(rDto.getListCnt()); // 페이지 수 저장
		rDto.setRange_cnt(rDto.getPage_cnt()); // 블럭 수 저장
		rDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치 rDto.setCurpa
		rDto.setCurPage1(sv.getCurPage1());
		rDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		rDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		rDto.setStart_page(rDto.getCur_range(), rDto.getRange_size()); // 현재 블럭 시작 페이지
		rDto.setEnd_page(rDto.getCur_range(), rDto.getRange_cnt()); // 현재 블럭 끝
		System.out.println("게시글 갯수 : " + rDto.getListCnt());
		System.out.println("페이지 갯수 : " + rDto.getPage_cnt());
		return rDto;
	}

	@Override
	public List<ReviewDTO> PhotoReviewPageNationList(SearchValue sv) {

		return productDao.PhotoReviewPageNationList(sv);
	}

	@Override
	public ReviewPageNationDTO ReviewPageNation(SearchValue sv) {
		ReviewPageNationDTO pDto = productDao.ReviewPageNation(sv);
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

	@Override
	public List<ReviewDTO> ReviewPageNationList(SearchValue sv) {
		// TODO Auto-generated method stub
		return productDao.ReviewPageNationList(sv);
	}

	@Override
	public ProductPageNationDTO categoryPageNationListDTO(SearchValue sv) {
		ProductPageNationDTO pDto = productDao.categoryPageNationListDTO(sv);
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;

	}

	@Override
	public ProductPageNationDTO categoryPageNationDTO(SearchValue sv) {
		ProductPageNationDTO pDto = productDao.categoryPageNationDTO(sv);
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
	}

=======
>>>>>>> branch 'master' of https://github.com/HeoSungmoo/koitt01.git
}
