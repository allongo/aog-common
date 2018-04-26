package com.aog.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "umi_video")
public class UmiVideo {
    @Id
    private Integer id;

    /**
     * 云端视频id
     */
    private String ossvideoid;

    private String videoname;

    /**
     * 视频描述
     */
    private String videoabstract;

    /**
     * 视频url清晰度1080
     */
    private String videourls;

    /**
     * 视频分类
     */
    private Integer videotype;

    /**
     * 媒体id
     */
    private Integer publicationid;

    /**
     * 是否收费 0 收费 -1 免费
     */
    private Integer ischarge;

    /**
     * 收费时间限制
     */
    private Integer chargetime;

    /**
     * 浏览次数
     */
    private Integer viewcount;

    /**
     * 购买数量
     */
    private Integer buycount;

    /**
     * 首图url
     */
    private String headpicurl;

    /**
     * 排序id
     */
    private Integer sortid;

    /**
     * 级别 
     */
    private Integer level;

    /**
     * 视频发布时间
     */
    private Date subtime;

    /**
     * 30秒视频
     */
    private String videourl1;

    /**
     * 完整视频
     */
    private String videourl2;

    private Integer status;

    private Date createtime;

    private Date updatetime;

    private Integer createuid;

    private String createuname;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取云端视频id
     *
     * @return ossvideoid - 云端视频id
     */
    public String getOssvideoid() {
        return ossvideoid;
    }

    /**
     * 设置云端视频id
     *
     * @param ossvideoid 云端视频id
     */
    public void setOssvideoid(String ossvideoid) {
        this.ossvideoid = ossvideoid == null ? null : ossvideoid.trim();
    }

    /**
     * @return videoname
     */
    public String getVideoname() {
        return videoname;
    }

    /**
     * @param videoname
     */
    public void setVideoname(String videoname) {
        this.videoname = videoname == null ? null : videoname.trim();
    }

    /**
     * 获取视频描述
     *
     * @return videoabstract - 视频描述
     */
    public String getVideoabstract() {
        return videoabstract;
    }

    /**
     * 设置视频描述
     *
     * @param videoabstract 视频描述
     */
    public void setVideoabstract(String videoabstract) {
        this.videoabstract = videoabstract == null ? null : videoabstract.trim();
    }

    /**
     * 获取视频url清晰度1080
     *
     * @return videourls - 视频url清晰度1080
     */
    public String getVideourls() {
        return videourls;
    }

    /**
     * 设置视频url清晰度1080
     *
     * @param videourls 视频url清晰度1080
     */
    public void setVideourls(String videourls) {
        this.videourls = videourls == null ? null : videourls.trim();
    }

    /**
     * 获取视频分类
     *
     * @return videotype - 视频分类
     */
    public Integer getVideotype() {
        return videotype;
    }

    /**
     * 设置视频分类
     *
     * @param videotype 视频分类
     */
    public void setVideotype(Integer videotype) {
        this.videotype = videotype;
    }

    /**
     * 获取媒体id
     *
     * @return publicationid - 媒体id
     */
    public Integer getPublicationid() {
        return publicationid;
    }

    /**
     * 设置媒体id
     *
     * @param publicationid 媒体id
     */
    public void setPublicationid(Integer publicationid) {
        this.publicationid = publicationid;
    }

    /**
     * 获取是否收费 0 收费 -1 免费
     *
     * @return ischarge - 是否收费 0 收费 -1 免费
     */
    public Integer getIscharge() {
        return ischarge;
    }

    /**
     * 设置是否收费 0 收费 -1 免费
     *
     * @param ischarge 是否收费 0 收费 -1 免费
     */
    public void setIscharge(Integer ischarge) {
        this.ischarge = ischarge;
    }

    /**
     * 获取收费时间限制
     *
     * @return chargetime - 收费时间限制
     */
    public Integer getChargetime() {
        return chargetime;
    }

    /**
     * 设置收费时间限制
     *
     * @param chargetime 收费时间限制
     */
    public void setChargetime(Integer chargetime) {
        this.chargetime = chargetime;
    }

    /**
     * 获取浏览次数
     *
     * @return viewcount - 浏览次数
     */
    public Integer getViewcount() {
        return viewcount;
    }

    /**
     * 设置浏览次数
     *
     * @param viewcount 浏览次数
     */
    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    /**
     * 获取购买数量
     *
     * @return buycount - 购买数量
     */
    public Integer getBuycount() {
        return buycount;
    }

    /**
     * 设置购买数量
     *
     * @param buycount 购买数量
     */
    public void setBuycount(Integer buycount) {
        this.buycount = buycount;
    }

    /**
     * 获取首图url
     *
     * @return headpicurl - 首图url
     */
    public String getHeadpicurl() {
        return headpicurl;
    }

    /**
     * 设置首图url
     *
     * @param headpicurl 首图url
     */
    public void setHeadpicurl(String headpicurl) {
        this.headpicurl = headpicurl == null ? null : headpicurl.trim();
    }

    /**
     * 获取排序id
     *
     * @return sortid - 排序id
     */
    public Integer getSortid() {
        return sortid;
    }

    /**
     * 设置排序id
     *
     * @param sortid 排序id
     */
    public void setSortid(Integer sortid) {
        this.sortid = sortid;
    }

    /**
     * 获取级别 
     *
     * @return level - 级别 
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置级别 
     *
     * @param level 级别 
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取视频发布时间
     *
     * @return subtime - 视频发布时间
     */
    public Date getSubtime() {
        return subtime;
    }

    /**
     * 设置视频发布时间
     *
     * @param subtime 视频发布时间
     */
    public void setSubtime(Date subtime) {
        this.subtime = subtime;
    }

    /**
     * 获取30秒视频
     *
     * @return videourl1 - 30秒视频
     */
    public String getVideourl1() {
        return videourl1;
    }

    /**
     * 设置30秒视频
     *
     * @param videourl1 30秒视频
     */
    public void setVideourl1(String videourl1) {
        this.videourl1 = videourl1 == null ? null : videourl1.trim();
    }

    /**
     * 获取完整视频
     *
     * @return videourl2 - 完整视频
     */
    public String getVideourl2() {
        return videourl2;
    }

    /**
     * 设置完整视频
     *
     * @param videourl2 完整视频
     */
    public void setVideourl2(String videourl2) {
        this.videourl2 = videourl2 == null ? null : videourl2.trim();
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return updatetime
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * @return createuid
     */
    public Integer getCreateuid() {
        return createuid;
    }

    /**
     * @param createuid
     */
    public void setCreateuid(Integer createuid) {
        this.createuid = createuid;
    }

    /**
     * @return createuname
     */
    public String getCreateuname() {
        return createuname;
    }

    /**
     * @param createuname
     */
    public void setCreateuname(String createuname) {
        this.createuname = createuname == null ? null : createuname.trim();
    }
}