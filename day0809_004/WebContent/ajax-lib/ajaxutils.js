/**
 * 
 */
function createXMLHttpRequest() {
    try {
        return new XMLHttpRequest();
    } catch (error) {
        alert("请用谷歌浏览器！");
        throw error;
    }
}

function ajax(option) {
    /**
     * option: {method:"POST", url:"", async:true, params:"",
     *          responseType:"xml", callback:function(){}}
     */
    if(!option.method) {
        option.method = "GET";
    }
    if(option.async == undefined) {
        option.async = true;
    }
    var xmlHttp = createXMLHttpRequest();
    xmlHttp.open(option.method, option.url, option.async);
    xmlHttp.send(option.params);
    xmlHttp.onreadystatechange = function(){
        if(xmlHttp.readyState == 4 && xmlHttp.status == 200) {
            var data;
            if(option.responseType == undefined || option.responseType == "text") {
                data = xmlHttp.responseText;
            } else if(option.responseType == "xml"){
                data = xmlHttp.responseXML;
            } else if(option.responseType == "json"){
                var json = xmlHttp.responseText;
                data = eval("(" + json + ")");
            } else {
                data = xmlHttp.responseText;
			}
			alert(data);
            option.callback(data);
        }
    };
}