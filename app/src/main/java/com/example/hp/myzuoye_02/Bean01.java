package com.example.hp.myzuoye_02;

import java.util.List;

/**
 * Created by hp on 2017/10/17.
 */
public class Bean01 {

    /**
     * reason : 请求成功
     * result : {"list":[{"id":"wechat_20171017035279","title":"无痕无钢圈内衣，自带按摩效果，胸越穿越大！","source":"甜甜的生活手札","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-55053810.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171017035279"},{"id":"wechat_20171017035428","title":"德德玛老师唱首《梦中的故乡》，感动着每位听众！","source":"玛拉沁信息网","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-27697013.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171017035428"},{"id":"wechat_20171017035425","title":"专栏 | 英意龙虎斗\u2014\u2014攻势足球的碰撞！","source":"球探体育","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-55054038.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171017035425"},{"id":"wechat_20171017035396","title":"竞篮 | 骑士勇夺赛季开门红 火箭客场射落勇士","source":"球探体育","firstImg":"","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171017035396"},{"id":"wechat_20171017035601","title":"【实用】超神奇！原来剥栗子只要3秒钟，这么多年你都做错了→","source":"央视财经","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-52797226.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171017035601"}],"totalPage":33366,"ps":5,"pno":2}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * list : [{"id":"wechat_20171017035279","title":"无痕无钢圈内衣，自带按摩效果，胸越穿越大！","source":"甜甜的生活手札","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-55053810.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171017035279"},{"id":"wechat_20171017035428","title":"德德玛老师唱首《梦中的故乡》，感动着每位听众！","source":"玛拉沁信息网","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-27697013.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171017035428"},{"id":"wechat_20171017035425","title":"专栏 | 英意龙虎斗\u2014\u2014攻势足球的碰撞！","source":"球探体育","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-55054038.jpg/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171017035425"},{"id":"wechat_20171017035396","title":"竞篮 | 骑士勇夺赛季开门红 火箭客场射落勇士","source":"球探体育","firstImg":"","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171017035396"},{"id":"wechat_20171017035601","title":"【实用】超神奇！原来剥栗子只要3秒钟，这么多年你都做错了→","source":"央视财经","firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-52797226.static/640","mark":"","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171017035601"}]
         * totalPage : 33366
         * ps : 5
         * pno : 2
         */

        private int totalPage;
        private int ps;
        private int pno;
        private List<ListBean> list;

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getPs() {
            return ps;
        }

        public void setPs(int ps) {
            this.ps = ps;
        }

        public int getPno() {
            return pno;
        }

        public void setPno(int pno) {
            this.pno = pno;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * id : wechat_20171017035279
             * title : 无痕无钢圈内衣，自带按摩效果，胸越穿越大！
             * source : 甜甜的生活手札
             * firstImg : http://zxpic.gtimg.com/infonew/0/wechat_pics_-55053810.static/640
             * mark :
             * url : http://v.juhe.cn/weixin/redirect?wid=wechat_20171017035279
             */

            private String id;
            private String title;
            private String source;
            private String firstImg;
            private String mark;
            private String url;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getFirstImg() {
                return firstImg;
            }

            public void setFirstImg(String firstImg) {
                this.firstImg = firstImg;
            }

            public String getMark() {
                return mark;
            }

            public void setMark(String mark) {
                this.mark = mark;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
