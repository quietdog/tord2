{"filter":false,"title":"Controller.groovy","tooltip":"/src/templates/artifacts/Controller.groovy","undoManager":{"mark":16,"position":16,"stack":[[{"start":{"row":1,"column":0},"end":{"row":2,"column":0},"action":"insert","lines":["",""],"id":2}],[{"start":{"row":2,"column":0},"end":{"row":6,"column":2},"action":"insert","lines":["\tdef afterInterceptor = [action: this.&applyPageData] ","\t","\tprivate applyPageData(model){","\t\tmodel.pageData = Page.findByName(\"ADMIN_PAGE\");","\t}"],"id":3}],[{"start":{"row":6,"column":2},"end":{"row":7,"column":0},"action":"insert","lines":["",""],"id":4},{"start":{"row":7,"column":0},"end":{"row":7,"column":1},"action":"insert","lines":["\t"]}],[{"start":{"row":9,"column":0},"end":{"row":10,"column":0},"action":"remove","lines":["\t\tdef pageData = Page.findByName(\"ADMIN_PAGE\");",""],"id":5}],[{"start":{"row":9,"column":0},"end":{"row":10,"column":0},"action":"remove","lines":["\t\tmodel:[pageData: pageData]",""],"id":6}],[{"start":{"row":8,"column":17},"end":{"row":8,"column":18},"action":"remove","lines":[" "],"id":7}],[{"start":{"row":0,"column":0},"end":{"row":1,"column":0},"action":"insert","lines":["",""],"id":8}],[{"start":{"row":0,"column":0},"end":{"row":0,"column":27},"action":"insert","lines":["import com.tord.admin.Page "],"id":9}],[{"start":{"row":0,"column":27},"end":{"row":1,"column":0},"action":"insert","lines":["",""],"id":10}],[{"start":{"row":2,"column":17},"end":{"row":3,"column":0},"action":"insert","lines":["",""],"id":11}],[{"start":{"row":2,"column":17},"end":{"row":3,"column":0},"action":"insert","lines":["",""],"id":13}],[{"start":{"row":3,"column":0},"end":{"row":3,"column":26},"action":"insert","lines":["import com.tord.admin.Page"],"id":14}],[{"start":{"row":0,"column":0},"end":{"row":1,"column":0},"action":"remove","lines":["import com.tord.admin.Page ",""],"id":15}],[{"start":{"row":0,"column":0},"end":{"row":1,"column":0},"action":"remove","lines":["",""],"id":16}],[{"start":{"row":1,"column":26},"end":{"row":2,"column":0},"action":"insert","lines":["",""],"id":17}],[{"start":{"row":3,"column":0},"end":{"row":3,"column":1},"action":"remove","lines":["@"],"id":18}],[{"start":{"row":0,"column":17},"end":{"row":0,"column":18},"action":"insert","lines":["@"],"id":19}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":4,"column":0},"end":{"row":4,"column":0},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1442498479064,"hash":"98e148a2e9c0500d2ff07f4be23c29b6891983df"}