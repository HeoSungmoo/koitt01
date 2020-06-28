package com.koitt.jardin.service.product;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.koitt.jardin.dao.product.ProductDAO;
import com.koitt.jardin.dto.page.PhotoReviewPageNationDTO;
import com.koitt.jardin.dto.page.ProductPageNationDTO;
import com.koitt.jardin.dto.page.QnaPageNationDTO;
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

	@Override
	public List<ProductDTO> list() {
		
		return productDao.list();
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

	@Override
	public List<ProductDTO> productPageNationList(SearchValue sv) {
		// TODO Auto-generated method stub
		return productDao.productPageNationList(sv);
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
		System.out.println("게시글 갯수 : " + pDto.getListCnt());
		System.out.println("페이지 갯수 : " + pDto.getPage_cnt());
		System.out.println("블록 갯수 :  "+ pDto.getCur_range());
		System.out.println("현재 블록 끝 페이지 : "+pDto.getEnd_page());
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
		return pDto;
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

	@Override
	public List<ReviewDTO> PhotoReviewPageNationList(SearchValue sv) {

		return productDao.PhotoReviewPageNationList(sv);
	}

	@Override
	public PhotoReviewPageNationDTO PhotoReviewPageNation(SearchValue sv) {

		PhotoReviewPageNationDTO rDto = productDao.PhotoReviewPageNation(sv);
		rDto.setPage_cnt1(rDto.getListCnt()); // 페이지 수 저장
		rDto.setRange_cnt1(rDto.getPage_cnt1()); // 블럭 수 저장
		rDto.setCurPage1(sv.getCurPage1()); // 현재 페이지 위치 rDto.setCurpa
		rDto.setCur_range1(sv.getCurPage1()); // 현재 블럭 위치
		rDto.prevnext1(sv.getCurPage1()); // 이전 블럭, 다음 블럭 설정
		rDto.setStart_page1(rDto.getCur_range1(), rDto.getRange_size()); // 현재 블럭 시작 페이지
		rDto.setEnd_page1(rDto.getCur_range1(), rDto.getRange_cnt1()); // 현재 블럭 끝

		return rDto;
	}

	@Override
	public List<ReviewDTO> ReviewPageNationList(SearchValue sv) {
	
		return productDao.ReviewPageNationList(sv);
	}

	@Override
	public ReviewPageNationDTO ReviewPageNation(SearchValue sv) {
		ReviewPageNationDTO pDto = productDao.ReviewPageNation(sv);
		pDto.setPage_cnt2(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt2(pDto.getPage_cnt2()); // 블럭 수 저장
		pDto.setCurPage2(sv.getCurPage2()); // 현재 페이지 위치
		pDto.setCur_range2(sv.getCurPage2()); // 현재 블럭 위치
		pDto.prevnext2(sv.getCurPage2()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page2(pDto.getCur_range2(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page2(pDto.getCur_range2(), pDto.getRange_cnt2()); // 현재 블럭 끝
		System.out.println("일반리뷰 게시글 갯수 : " + pDto.getListCnt());
		System.out.println("일반리뷰 페이지 갯수 : " + pDto.getPage_cnt2());
		System.out.println("일반리뷰 블록 갯수 :  "+ pDto.getCur_range2());
		System.out.println("일반리뷰 현재 블록 시작 페이지 : "+pDto.getStart_page2() );
		System.out.println("일반리뷰 현재 블록 끝 페이지 : "+pDto.getEnd_page2());
		return pDto;
	}

	// 질문과 답변 페이지네이션 리스트
	@Override
	public List<QnaDTO> QnApageNationList(SearchValue sv) {

		return productDao.QnApageNationList(sv);
	}

	// 질문과 답변 페이지네이션 페이지,게시물 수 확인
	@Override
	public QnaPageNationDTO QnApageNation(SearchValue sv) {
		QnaPageNationDTO pDto = productDao.QnApageNation(sv);
		pDto.setPage_cnt(pDto.getListCnt()); // 페이지 수 저장
		pDto.setRange_cnt(pDto.getPage_cnt()); // 블럭 수 저장
		pDto.setCurPage(sv.getCurPage()); // 현재 페이지 위치
		pDto.setCur_range(sv.getCurPage()); // 현재 블럭 위치
		pDto.prevnext(sv.getCurPage()); // 이전 블럭, 다음 블럭 설정
		pDto.setStart_page(pDto.getCur_range(), pDto.getRange_size()); // 현재 블럭 시작 페이지
		pDto.setEnd_page(pDto.getCur_range(), pDto.getRange_cnt()); // 현재 블럭 끝
//		System.out.println("qna 게시글 갯수 : " + pDto.getListCnt());
//		System.out.println("qna 페이지 갯수 : " + pDto.getPage_cnt());
//		System.out.println("qna 블록 갯수 :  "+ pDto.getCur_range());
//		System.out.println("qna 현재 블록 끝 페이지 : "+pDto.getEnd_page());
		return pDto;
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
	@Override
	public List<CommentDto> comment_List() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void comment_delete(int cId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comment_insert(CommentDto comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comment_update(CommentDto comment) {
		// TODO Auto-generated method stub
		
	}

	

}
